package exp3;
import java.util.Scanner;

class Exp3{
    public static void main(String[] args) {

        int ID;
        String name;
        String dept;
        int age;
        double percent;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID:");
        ID = sc.nextInt();

        System.out.println("Enter Student Name:");
        sc.nextLine();
        name = sc.nextLine();

        System.out.println("Enter the Department:");
        dept = sc.nextLine();

        System.out.println("Enter the Age:");
        age = sc.nextInt();

        System.out.println("Enter the Percentage:");
        percent = sc.nextDouble();

        System.out.println("----- Student Details -----");
        System.out.println("Student ID: " + ID);
        System.out.println("Student Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percent);

        sc.close();
    }
}

