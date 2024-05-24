import java.util.*;
public class Program5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int answer = sum_Of_Digits(n);
        System.out.println(answer);
    }

    public static int sum_Of_Digits(int n) {
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
