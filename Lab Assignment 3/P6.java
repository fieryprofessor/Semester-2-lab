
public class P6 {

    public static <T> int count(T array[], T item) {
        int c = 0;
        for (int i = 0; i < array.length; i++) {
             
            if(array[i].equals(item))
                c++;
        }
        return c;
    }
    public static void main(String args[]) {
        Integer intArray[] = { 1, 2, 3, 1, 3, 1, 4, 1 };
        Double doubleArray[] = { 3.14, 4.56, 3.14, 7.84, 3.14 };
        Character charArray[] = { 'A', 'B', 'A', 'D', 'A' };
        System.out.println("count of the int item is: " + count(intArray, 1));
        System.out.println("count of double item is: " + count(doubleArray, 3.14));
        System.out.println("count of the char item is: " + count(charArray, 'A'));
    }
}
