package service;

import model.Course;
import model.Registration;
import model.Student;
import exception.CourseFullException;
import java.util.ArrayList;

public class RegistrationService {

    private ArrayList<Registration> registrations = new ArrayList<>();


    public void registerStudent(Student student, Course course)
            throws CourseFullException {

        int enrolled = getEnrolledCount(course);
        if (enrolled >= course.getCapacity()) {
            throw new CourseFullException(
                    "Course \"" + course.getCourseName() + "\" is full (" +
                            course.getCapacity() + "/" + course.getCapacity() + " seats taken).");
        }
        registrations.add(new Registration(student, course));
    }


    public int getEnrolledCount(Course course) {
        int count = 0;
        for (Registration r : registrations) {
            if (r.getCourse().getCourseCode().equals(course.getCourseCode())) {
                count++;
            }
        }
        return count;
    }


    public int getSeatsLeft(Course course) {
        return course.getCapacity() - getEnrolledCount(course);
    }

    public ArrayList<Registration> getRegistrations() { return registrations; }
}
