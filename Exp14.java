import java.io.*;
public class Main {
    public static void main(String[] args) {
        String fileName = "student.txt";
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Student Record");
            bw.newLine();        bw.write("-------------------------");
            bw.newLine();
            bw.write("Roll No : 101");
            bw.newLine();
            bw.write("Name       : Rahul");
            bw.newLine();
            bw.write("Course : B.Tech Information Technology");
            bw.newLine();
            bw.write("CGPA        : 8.75");
            bw.close();
            System.out.println("Data written successfully.\n");
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("Contents of the File");    System.out.println("----------------------------");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}