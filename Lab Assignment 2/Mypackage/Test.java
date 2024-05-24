package Mypackage;

import LabAssignment2.Test3;
import java.util.*;

 interface Sports {
    int score1 = 90;
    int score2 = 95;
}

public class Test implements Sports {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Roll no.: ");
        int roll = sc.nextInt();
        System.out.println("Enter your Marks1: ");
        int marks1 = sc.nextInt();
        System.out.println("Enter your Marks2: ");
        int marks2 = sc.nextInt();
        sc.close();
        Test3 t = new Test3();
        t.inputDetails(name, roll);
        t.inputDetails(marks1, marks2);
        t.showDetails();
        System.out.println("Total score is: " + (score1 + score2));
    }
}