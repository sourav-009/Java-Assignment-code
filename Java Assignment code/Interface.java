import java.util.Scanner;

interface Shape {
    void square(int n);
    void cube(int n);
}

class Demo implements Shape {

    public void square(int n) {
        System.out.println("Square = " + (n * n));
    }

    public void cube(int n) {
        System.out.println("Cube = " + (n * n * n));
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Demo d = new Demo();
        d.square(n);
        d.cube(n);

        sc.close();
    }
}