import employee.Employee;
import java.util.Scanner;
public class Exp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        String name = sc.next();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        Employee emp = new Employee(id, name, salary);
        emp.displayEmployee();
        sc.close();
    }
}