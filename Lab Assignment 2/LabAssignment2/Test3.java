package LabAssignment2;

class Student {
    String name;
    int roll;

    public void inputDetails(String n, int r) {
        name = n;
        roll = r;
    }
    
   public  void showDetails() {
        System.out.println("Name is: " + name);
        System.out.println("Roll is: " + roll);
    }
}

public class Test3 extends Student {
    int mark1;
    int mark2;
    
   public  void inputDetails(int m1, int m2) {
        mark1 = m1;
        mark2 = m2;
    }

    public void showDetails() {
        System.out.println("Total marks is: " + (mark1 + mark2));
    }
}
