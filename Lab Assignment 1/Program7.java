import java.util.*;

public class Program7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  //declaring scanner

        System.out.print("Enter the number of elements of Array: ");  //declaring length of array
        int n = sc.nextInt();

        int arr[] = new int[n];   //declaring array

        System.out.println("Enter elements of the Array: ");  //entering array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();  //closing scanner

        int max = arr[0], min = arr[0];  //finding max and min elements
        for (int element : arr) {
            if (element > max)
                max = element;
            if (element < min)
                min = element;
        }
        occurenceFinder(arr, max, min);
        maxPositionFinder(arr, n, max);
        minPositionFinder(arr, n, min);
    }

    public static void occurenceFinder(int arr[],int max,int min){  //method to display the occurences of max and min
        int maxOccurs = 0;
        int minOccurs = 0;
        for (int element : arr) {
            if (element == max)
                maxOccurs++;
            if (element == min)
                minOccurs++;
        }
        System.out.println("Maximum element of the Array is " + max + " and occurs " + maxOccurs + " times");
        System.out.println("Minimum element of the Array is " + min + " and occurs " + minOccurs + " times");
    }
    
    public static void maxPositionFinder(int arr[], int n, int max) { //method to display first occurence of max
        int maxFirstPosition = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                maxFirstPosition = i+1;
                break;
            }
        }
        System.out.println("First occurence of maximum element is at position " + maxFirstPosition);
    }
    
    public static void minPositionFinder(int arr[], int n, int min) { //method to display last occurence of min
        int minLastPosition = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min)
                minLastPosition = i+1;
        }
        System.out.println("Last occurence of minimum element ia at position "+ minLastPosition); 
    }
}