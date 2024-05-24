import java.util.*;
public class Program9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); //declaring scanner

        double arr[][] = new double[4][4]; // declaring the array

        System.out.println("Enter a 4-by-4 matrix row by row: "); //Entering array elements
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }

        sc.close(); //closing the scanner

        System.out.println("Sum of elements in the major diagonal is: " + sumOfMajorDiagonal(arr));
    }
    
    public static double sumOfMajorDiagonal(double arr[][]) { //method to calculate the sum of elements o the major
        double sum = 0.0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j)
                    sum += arr[i][j];
            }
        }
        return sum;
    }
}
