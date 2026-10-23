import java.util.*;
class Student implements Comparable<Student> {
    int rollNo;
    String name;
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }
    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(103, "Rahul"));
        students.add(new Student(101, "Anitha"));
        students.add(new Student(102, "Karthik"));
        System.out.println("Students Before Sorting");
        for (Student s : students) {
            System.out.println(s);
        }
        Collections.sort(students);
        System.out.println("\nSorted by Roll Number (Comparable)");

        for (Student s : students) {
            System.out.println(s);
        }
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name (Comparator)");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}