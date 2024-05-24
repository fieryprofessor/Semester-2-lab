import java.util.*;

public class Program6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(n + " is odd: " + isOdd(n));
    }

    public static boolean isOdd(int n) {
        if((n&1)==1)
            return true;
        else
            return false;
    }
}
