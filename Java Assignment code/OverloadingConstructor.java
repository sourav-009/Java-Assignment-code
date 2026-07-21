import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    Student() {
        rollNo = 0;
        name = "Unknown";
    }

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name = " + name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        Student s2 = new Student(r, n);

        System.out.println("\nDefault Constructor:");
        s1.display();

        System.out.println("\nParameterized Constructor:");
        s2.display();

        sc.close();
    }
}