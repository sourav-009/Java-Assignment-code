package mypackage;

public class Demo {
    public void display() {
        System.out.println("Welcome to Java Package");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}