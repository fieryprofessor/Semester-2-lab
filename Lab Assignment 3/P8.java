import java.util.*;

public class P8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the power: ");
        int p = sc.nextInt();
        sc.close();
        System.out.println("The final answer will be: " + powerFinder(n, p));
    }

    public static int powerFinder(int n, int x) {
        if (x == 1) {
            return n;
        }
        int answer = n * powerFinder(n, x - 1);
        return answer;
    }
}
