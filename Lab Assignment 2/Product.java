public class Product {
    int procID;
    double price;
    int quantity;
    static double totalPrice;

    Product(int ID, double p, int q) {
        procID = ID;
        price = p;
        quantity = q;
        totalPrice += price * quantity;
    }

    void display() {
        System.out.println("product Id is: " + procID);
        System.out.println("product price is: " + price);
        System.out.println("product quantity is: " + quantity + "\n");
    }
    
    public static void main(String args[]) {
        Product p1 = new Product(1,10,5);
        Product p2 = new Product(2,20,4);
        Product p3 = new Product(3,30,3);
        Product p4 = new Product(4,40,2);
        Product p5 = new Product(5, 50, 1);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();

        System.out.println("Total amount to pay is: " + totalPrice);
    }
}
