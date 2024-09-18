package lab4.service;

import lab4.entities.Student;

import java.util.Scanner;

public class StudentService implements Iclassification {
    public Student inputStudent(Scanner scanner){
        System.out.println("Mời bạn nhập vào thông tin của sinh viên");
        System.out.println("Mời bạn nhập vào tên:");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập vào tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập vào điểm:");
        double mark = Double.parseDouble(scanner.nextLine());
        String classification = classify(mark);
        return new Student(name,age,mark,classification);

    }


    @Override
    public String classify(double mark) {
        if(mark>= 8){
            return "A";
        }else if( mark <8 && mark > 6.5){
            return "B";
        }else{
            return "C";
        }
    }

    @Override
    public void display(Student student) {
        System.out.println(student);
    }
}
