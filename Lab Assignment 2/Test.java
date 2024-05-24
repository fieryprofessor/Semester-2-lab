
import java.util.*;

 class Person {
     String name;
     int age;

     Person(String n, int a){
        name = n;
        age = a;
     }
}

class Employee extends Person {
    int Eid;
    double salary;

    Employee(String n, int a, int id, double s) {
        super(n, a);
        name = n;
        age = a;
        Eid = id;
        salary = s;
    }

    void empDisplay() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("E id: " + Eid);
        System.out.println("Salary: " + salary);
    }
}

public class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Employee: ");
        String n = sc.nextLine();
        System.out.println("Enter the age of the Employee: ");
        int a = sc.nextInt();
        System.out.println("Enter the ID of the Employee: ");
        int id = sc.nextInt();
        System.out.println("Enter the salary of the Employee: ");
        double s = sc.nextDouble();
        Employee e1 = new Employee(n, a, id, s);
        e1.empDisplay();
        sc.close();
    }
}