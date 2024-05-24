import java.util.*;

public class Deposit {
    long principal;
    int time;
    double rate;
    double totalamt = 0.0;

    Deposit() {

    }

    Deposit(long p, int t, double r) {
        principal = p;
        time = t;
        rate = r;
    }

    Deposit(long p, int t) {
        principal = p;
        time = t;
    }

    Deposit(long p, double r) {
        principal = p;
        rate = r;
    }

    void display() {
        System.out.println("Principal value is: " + principal);
        System.out.println("Time is: " + time);
        System.out.println("Rate is: " + rate);
        System.out.println("Total Amount is: " + totalamt + "\n");
    }

    void calcAmt() {
        totalamt = principal + (principal * rate * time) / 100;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal value: ");
        long p = sc.nextLong();
        System.out.println("Enter the time: ");
        int t = sc.nextInt();
        System.out.println("Enter the rate: ");
        double r = sc.nextDouble();
        sc.close();

        Deposit d1 = new Deposit(p, t, r);
        d1.calcAmt();
        d1.display();
    }
}