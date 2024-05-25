
import java.util.*;

public class P7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The factorial of "+n+" is : " + fact(n));
    }

    public static int fact(int n) {
        if (n == 1) {
            return n;
       }
       int f = n * fact(n - 1);
       return f;
    }
}
