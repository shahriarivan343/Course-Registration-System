package service;

import model.Student;
import exception.InvalidDataException;
import java.util.ArrayList;

public class StudentService {

    private static final int MAX_STUDENTS = 50;
    private ArrayList<Student> students = new ArrayList<>();


    public void addStudent(Student student) throws InvalidDataException {
        if (student.getName() == null || student.getName().trim().isEmpty()) {
            throw new InvalidDataException("Student name cannot be empty.");
        }
        if (student.getId() <= 0) {
            throw new InvalidDataException("Student ID must be a positive number.");
        }
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                throw new InvalidDataException("Student ID " + student.getId() + " already exists.");
            }
        }
        if (students.size() >= MAX_STUDENTS) {
            throw new InvalidDataException(
                    "System capacity reached. Maximum " + MAX_STUDENTS + " students allowed.");
        }
        students.add(student);
    }

    public ArrayList<Student> getStudents() { return students; }

    public int getStudentCount()    { return students.size(); }
    public int getRemainingSlots()  { return MAX_STUDENTS - students.size(); }
    public int getMaxCapacity()     { return MAX_STUDENTS; }
}