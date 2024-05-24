import java.util.*;
public class Complex {
    int real;
    int img;
    
    void setData(int real, int img) {
        this.real = real;
        this.img = img;
    }

    void display() {
        System.out.println("The complex number is: " + real + "+" + img + "i");
    }

    public Complex add(Complex c1, Complex c2) {
        Complex c3 = new Complex();
        c3.real = c1.real + c2.real;
        c3.img = c1.img + c2.img;
        return c3;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first complex number: ");
        int real1 = sc.nextInt();
        int img1 = sc.nextInt();

        System.out.println("Enter second complex number: ");
        int real2 = sc.nextInt();
        int img2 = sc.nextInt();

        sc.close();

        Complex c1 = new Complex();
        Complex c2 = new Complex();

        c1.setData(real1, img1);
        c2.setData(real2, img2);

        c1.display();
        c2.display();

        Complex c3 = new Complex();
        c3 = c3.add(c1, c2);
        c3.display();
    }
}
