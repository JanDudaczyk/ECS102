public class Main {
    public static void main(String[] args) {
       System.out.println("Welcome to the Interest Calculator!");

       Loan loan1 = new Loan(1000, 10, 1, 12);
       System.out.printf("Loan 1 Simple Interest: $%.2f%n", loan1.calculateSimpleInterest());
       System.out.printf("Loan 1 Total Repayment: $%.2f%n", loan1.calculateTotalRepayment());

       Loan loan2 = new Loan(5000, 6.75, 12.5, 4);
       System.out.printf("Loan 2 Simple Interest: $%.2f%n", loan2.calculateSimpleInterest());
       System.out.printf("Loan 2 Total Repayment: $%.2f%n", loan2.calculateTotalRepayment());
    }
}