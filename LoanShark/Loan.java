public class Loan {

    //Instance variables to store loan detailsn 
    double principal;
    double rate;
    double time;
    int number;

    //Constructor turns interest rate percentage into a nice decimal 
    public Loan(double p, double r, double t, int n) {
        this.principal=p;
        this.rate=r/100.0;
        this.time=t;
        this.number=n;
    }
    //A = P + P*r*t (simple interest)
    double calculateSimpleInterest(){
        return principal + principal * rate * time;
    }
     //A = P(1 + r/n)^(n*t) (compound interest)
    double calculateTotalRepayment(){
        return principal * Math.pow(1+ rate/number,number*time);
    }   
 }
