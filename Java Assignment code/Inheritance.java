import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    void getStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }
}

class Result extends Student {
    int marks;

    void getMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Result r = new Result();

        r.getStudent();
        r.getMarks();
        r.display();
    }
}