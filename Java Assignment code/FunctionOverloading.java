import java.util.Scanner;

public class AverageDemo {

    static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Average = " + average(a, b));

        System.out.print("Enter 3 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Average = " + average(x, y, z));

        sc.close();
    }
}