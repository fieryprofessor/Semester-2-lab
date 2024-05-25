
public class P5 {

    public static <E> void printArray(E arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Integer intArray[] = { 1, 2, 3, 4, 5 };
        Double doubleArray[] = { 1.5, 2.5, 3.5, 4.5, 5.5 };
        Character charArray[] = {'A','B','C','D','E'};
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
