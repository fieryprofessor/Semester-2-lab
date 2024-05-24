import java.util.*;

public class Program10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); //declaring scanner

        double arr[][] = new double[3][4]; // declaring the array

        System.out.println("Enter a 3-by-4 matrix row by row: "); //Entering array elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }

        sc.close(); //closing the scanner
       
        for (int j = 0; j < 4; j++) {
            System.out.println("Sum of the elements at column " + j + " is " + sumCalculator(arr, j));
        }
    }

    public static double sumCalculator(double arr[][], int columnNumber) { // method to calculate the sum of elements in each column
                                                                           
        double sum = 0.0;
        for (int i = 0; i < 3; i++) {
            sum += arr[i][columnNumber];
        }
        return sum;
    }
}