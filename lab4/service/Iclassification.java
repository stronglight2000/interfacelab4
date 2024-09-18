package lab4.service;

import lab4.entities.Student;

public interface Iclassification {
    String classify(double mark);
    void display(Student student);
}
