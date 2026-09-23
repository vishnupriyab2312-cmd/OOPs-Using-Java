package exp2;
abstract class Employee {

    static String companyName = "ABC Technologies";
    public String department;
    private double salary;
    protected String designation;
    String location = "Coimbatore";

    Employee(String department, double salary, String designation) {
        this.department = department;
        this.salary = salary;
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    abstract void displayRole();
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String department, double salary, String designation,
              String programmingLanguage) {
        super(department, salary, designation);
        this.programmingLanguage = programmingLanguage;
    }

    void displayRole() {
        System.out.println("Role: Software Developer");
        System.out.println("Programming: " + programmingLanguage);
    }
}

public class Exp2 {

    public static void main(String[] args) {

        Developer emp = new Developer(
            "CSE",
            45000,
            "Junior Developer",
            "Java"
        );

        System.out.println("----- Employee Details -----");
        System.out.println("Company: " + Employee.companyName);
        System.out.println("Department: " + emp.department);
        System.out.println("Designation: " + emp.designation);
        System.out.println("Location: " + emp.location);
        System.out.println("Salary: " + emp.getSalary());

        emp.setSalary(50000);
        System.out.println("Updated Salary: " + emp.getSalary());

        emp.displayRole();
    }
}
