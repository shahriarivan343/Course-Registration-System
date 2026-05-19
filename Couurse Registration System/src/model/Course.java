package model;

public class Course {

    private String courseCode;
    private String courseName;
    private int capacity;

    public Course(String courseCode, String courseName, int capacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.capacity   = capacity;
    }

    public String getCourseCode()  { return courseCode; }
    public String getCourseName()  { return courseName; }
    public int    getCapacity()    { return capacity; }

    @Override
    public String toString() {
        return courseCode + " - " + courseName;
    }
}