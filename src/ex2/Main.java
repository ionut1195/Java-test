package ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Read CSV file
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            br.readLine(); // skip the first line (header)
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String name = parts[1];
                students.add(new Student(id, name)); // create a Student object
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        students.sort(Comparator.comparing(Student::getName));

        // print sorted students
        System.out.println("Sorted Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}