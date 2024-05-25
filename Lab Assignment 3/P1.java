import java.util.*;
public class P1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your lucky number: ");
        int n = sc.nextInt();
        sc.close();
        try {
            if (n < 0) {
                throw new NumberFormatException("negative number detected");
            } else {
                System.out.println("Your lucky number is: " + n);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("number cannot be negative");
        }
    }
}
