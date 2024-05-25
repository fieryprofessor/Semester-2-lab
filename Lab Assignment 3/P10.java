import java.util.*;


public class P10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term you want to find: ");
        int k = sc.nextInt();
        sc.close();
        System.out.println("The number is: "+fibo(k));
    }

    public static int fibo(int k) {
        if (k == 0 || k == 1) {
            return k;
        }
        int number = fibo(k - 1) + fibo(k - 2);
        return number;
    }
}
