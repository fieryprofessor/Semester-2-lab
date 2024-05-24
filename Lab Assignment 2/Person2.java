
 interface DetailInfo {
     void display();
     int count();
}

public class Person2 implements DetailInfo {
    static int maxcount;
    String name;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Count is: " + count());
    }

    public int count() {
        maxcount = name.length();
        return maxcount;
    }

    public static void main(String args[]) {
        Person2 p1 = new Person2();
        p1.name = "Om";
        p1.display();
    }
}
