
import java.util.*;


public class P9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        reverseFinder(n);
    }

    public static void reverseFinder(int n) {
        if (n < 10) {
            System.out.println(n);
            return ;
        }
        System.out.print(n % 10);
        reverseFinder(n / 10);
    }
}
