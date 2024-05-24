import java.util.*;

public class Program2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person Weight in kg: ");
        int weight = sc.nextInt();
        System.out.print("Enter height of person in meter: ");
        double height = sc.nextDouble();
        sc.close();
        double bmi = weight / (Math.pow(height, 2));
        if (bmi < 18.5) {
            System.out.println("The person is Underweight.");
        }
        else if(bmi>=18.5 && bmi<25.0){
            System.out.println("The person is Normal Weight.");
        }
        else if(bmi>=25.0 && bmi<30.0){
            System.out.println("The person is Overweight.");
        }
        else{
            System.out.println("The person is Obese.");
        }
    }
}
