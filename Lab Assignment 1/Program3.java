import java.util.*;
public class Program3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        int m=n;
        int sum = 0;
        int product=1;
        while (n != 0) {
            sum += n % 10;
            product *= n % 10;
            n = n / 10;
        }
        if(sum==product)
            System.out.println(m + " is a spy number.");
            else
                System.out.println(m + " is not a spy number.");
    }
}
