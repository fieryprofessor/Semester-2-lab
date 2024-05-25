
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

public class P4 {
    public static void main(String args[]) {
        // Experiment 1: Boxed String
        Box<String> stringBox1 = new Box<>("Hello");
        Box<String> stringBox2 = stringBox1;
        System.out.println("Initial content of stringBox1: " + stringBox1.getContent());
        System.out.println("Initial content of stringBox2: " + stringBox2.getContent());

        stringBox2.setContent("World");
        System.out.println("Content of stringBox1 after modification: " + stringBox1.getContent());
        System.out.println("Content of stringBox2 after modification: " + stringBox2.getContent());

        // Experiment 2: Boxed Integer
        Box<Integer> intBox1 = new Box<>(42);
        Box<Integer> intBox2 = intBox1;
        System.out.println("Initial content of intBox1: " + intBox1.getContent());
        System.out.println("Initial content of intBox2: " + intBox2.getContent());

        intBox2.setContent(99);
        System.out.println("Content of intBox1 after modification: " + intBox1.getContent());
        System.out.println("Content of intBox2 after modification: " + intBox2.getContent());

        // Experiment 3: Boxed Object
        Box<Object> objectBox1 = new Box<>(new Object());
        Box<Object> objectBox2 = objectBox1;
        System.out.println("Initial content of objectBox1: " + objectBox1.getContent());
        System.out.println("Initial content of objectBox2: " + objectBox2.getContent());

        objectBox2.setContent("A String");
        System.out.println("Content of objectBox1 after putting a String: " + objectBox1.getContent());
        System.out.println("Content of objectBox2 after putting a String: " + objectBox2.getContent());

        objectBox2.setContent(123);
        System.out.println("Content of objectBox1 after putting an Integer: " + objectBox1.getContent());
        System.out.println("Content of objectBox2 after putting an Integer: " + objectBox2.getContent());
    }
}
