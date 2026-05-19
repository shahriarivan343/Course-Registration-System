package model;

public class Student extends Person {

    private String department;

    public Student(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment()            { return department; }
    public void setDepartment(String dept)   { this.department = dept; }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    public String toString() {
        return getId() + " - " + getName();
    }
}
