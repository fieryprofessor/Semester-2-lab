import java.util.*;

public class Person {
    String name;
    int age;

    void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void displayData() {
        System.out.println("Name:" + name + " Age: " + age);
    }

    public static void main(String args[]) {
        
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Rohan";
        p1.age = 20;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.close();

        p2.setData(name, age);

        p1.displayData();
        p2.displayData();

        if(p1.age<p2.age)
            System.out.println(p1.name + " is younger.");
        else if(p1.age>p2.age)
            System.out.println(p2.name + " is younger.");
        else
            System.out.println(p1.name + " and " + p2.name + " are having same age");
    }
}