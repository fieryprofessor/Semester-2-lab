import java.util.*;
public class P2 {
    @SuppressWarnings({ "null", "unused", "resource" })
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = null;
        int arr2[] = { 1, 2, 3, 4, 5 };
        System.out.println("Enter the index to print the value corresponding to the first array");
        int a = sc.nextInt();
        int size;
        try {
            System.out.println(arr1[a]);
        }
        catch (NullPointerException ex1) {
            ex1.printStackTrace();
            System.out.println("Array cannot be null");
        }
        System.out.println("Enter the index to print the value corresponding to the second array");
        int i = sc.nextInt();
        try{
            System.out.println(arr2[i]);
        }
        catch (ArrayIndexOutOfBoundsException ex2) {
            ex2.printStackTrace();
            System.out.println("Array range is from 0 to 4");
        }
       
    }
}
