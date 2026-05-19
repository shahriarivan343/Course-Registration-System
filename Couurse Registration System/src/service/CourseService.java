package service;

import model.Course;
import java.util.ArrayList;

public class CourseService {

    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public ArrayList<Course> getCourses() { return courses; }

    public int getCourseCount() { return courses.size(); }
}