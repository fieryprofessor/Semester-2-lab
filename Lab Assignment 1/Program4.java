import java.util.*;
public class Program4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        Permute(s, "");
        sc.close();
    }

    public static void Permute(String ip, String op) {    //method to print the permutations
    
        if (ip.length() == 0) {              //base case
            System.out.println(op);
            return;
        }

        for (int i = 0; i < ip.length(); i++) {      //recursive case
            char ch = ip.charAt(i);
            String left = ip.substring(0, i); 
            String right = ip.substring(i + 1);
            String rest = left + right;
            Permute(rest, op + ch);
        }
}
}
