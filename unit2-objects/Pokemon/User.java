import greenfoot.*;

public class User extends Actor
{
    private String name;
    private Pokemon pokemon;

    public User(String name)
    {
        this.name = name;
        this.pokemon = null;
    }

    public void setPokemon(Pokemon p)
    {
        this.pokemon = p;
    }

    public Pokemon getPokemon()
    {
        return this.pokemon;
    }

    public void switchPokemon(Pokemon newPokemon)
    {
        this.pokemon = newPokemon;
        System.out.println(this.name + " switched to " + newPokemon.getName() + "!");
    }

    public void heal()
    {
        if (this.pokemon != null) {
            this.pokemon.heal();
            System.out.println(this.name + "'s " + this.pokemon.getName() + " was healed!");
        }
    }

    public void attack(String name, User enemy)
    {
        if (this.pokemon != null && enemy != null && enemy.getPokemon() != null) {
            this.pokemon.attack(name, enemy);
            System.out.println(this.name + "'s " + this.pokemon.getName() +
                             " used " + name + " against " + enemy.getPokemon().getName() + "!");
        }
    }

    public boolean isEndGame()
    {
        if (this.pokemon != null) {
            return this.pokemon.isOut();
        }
        return false;
    }

    public String getName()
    {
        return this.name;
    }

    public void act()
    {
    }
}