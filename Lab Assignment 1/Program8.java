import java.util.*;
public class Program8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); //declaring scanner

        System.out.print("Enter the number of Row and Columns of 2D-Array: "); //declaring size of 2D-Array
        int n = sc.nextInt();

        int arr[][] = new int[n][n]; //creating 2D-Array

        System.out.println("Enter elements of 2D-Array: "); //Entering the elements of 2D-Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close(); //closing the scanner

        System.out.println("The elements of 2D Array are: ");
        display(arr, n);
        System.out.println("The sum of elements of 2D Array is: " + sumCalculator(arr, n));
    }

    public static void display(int arr[][], int n) {  //method to display the elements of 2D-Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumCalculator(int arr[][], int n) { //method to calculate the sum of elements of 2D-Array
        int sum = 0;
        for (int innerarray[] : arr) {
            for (int element : innerarray) {
                sum += element;
            }
        }
        return sum;
    }
}
