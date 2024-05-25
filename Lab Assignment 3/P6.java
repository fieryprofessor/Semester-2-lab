
public class P6 {

    public static <T> int count(T array[], T item) {
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==item)
                c++;
        }
        return c;
    }
    public static void main(String args[]) {
        Integer intArray[] = { 1,2,3,1,3,1,4,1};
        Character charArray[] = { 'A', 'B', 'A', 'D', 'A' };
        System.out.println("count of the int item is: " + count(intArray, 1));
        System.out.println("count of the char item is: " + count(charArray, 'A'));
    }
}
