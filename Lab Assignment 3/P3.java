
import java.util.*;

class MArksOutOfBoundsException extends Exception {
    MArksOutOfBoundsException(String msg) {
        super(msg);
    }
}
public class P3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();
        sc.close();
        try{
            if(marks>100)
                throw new MArksOutOfBoundsException("Marks cannot be more than 100");
            System.out.println(name + " secured " + marks + " marks.");
        }
        catch (MArksOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
