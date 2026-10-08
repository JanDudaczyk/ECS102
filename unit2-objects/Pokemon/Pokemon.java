import greenfoot.*;

public class Pokemon extends Actor
{
    private int hp;
    private int maxHp;
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;

    public Pokemon(int hp, int ap, String name, String attackName, String type)
    {
        this.hp = hp;
        this.maxHp = hp;
        this.ap = ap;
        this.name = name;
        this.attack = new Attack(attackName);
        this.type = type;
        this.outStatus = false;

        try {
            this.img = new GreenfootImage(name + ".png");
            setImage(this.img);
        } catch (Exception e) {
            System.out.println("Image not found: " + name + ".png");
        }
    }

    public String getType()
    {
        return this.type;
    }

    public void attack(String attackName, User enemy)
    {
        if (this.ap > 0 && enemy != null && enemy.getPokemon() != null) {
            int damage = getAttackPower(attackName, enemy);
            enemy.getPokemon().takeDamage(damage);
            this.ap -= 10;
        }
    }

    public void takeDamage(int amount)
    {
        this.hp -= amount;
        if (this.hp <= 0) {
            this.hp = 0;
            this.outStatus = true;
        }
    }

    public void heal()
    {
        this.hp = this.maxHp;
        this.ap = 100;
        this.outStatus = false;
    }

    public void printAttack()
    {
        System.out.println("Attack: " + this.attack.getName() + " (Power: " + this.attack.getPower() + ")");
    }

    public int getAttackPower(String attackName, User enemy)
    {
        int basePower = this.attack.getPower();
        String enemyType = enemy.getPokemon().getType();

        if (this.type.equals("Fire") && enemyType.equals("Grass")) {
            basePower = (int)(basePower * 1.5);
        } else if (this.type.equals("Water") && enemyType.equals("Fire")) {
            basePower = (int)(basePower * 1.5);
        } else if (this.type.equals("Grass") && enemyType.equals("Water")) {
            basePower = (int)(basePower * 1.5);
        }

        return basePower;
    }

    public int getHp()
    {
        return this.hp;
    }

    public int getAp()
    {
        return this.ap;
    }

    public String getName()
    {
        return this.name;
    }

    public boolean isOut()
    {
        return this.outStatus;
    }

    public Attack getAttack()
    {
        return this.attack;
    }

    @Override
    public void act()
    {
    }
}