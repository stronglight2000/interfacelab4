package lab4;

import lab4.entities.Student;
import lab4.service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        Student student = studentService.inputStudent(scanner);
        studentService.display(student);

    }
}
