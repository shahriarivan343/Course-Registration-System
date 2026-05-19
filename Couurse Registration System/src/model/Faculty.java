package model;

public class Faculty extends Person {

    private String designation;

    public Faculty(int id, String name, String designation) {
        super(id, name);
        this.designation = designation;
    }

    public String getDesignation()               { return designation; }
    public void setDesignation(String desig)     { this.designation = desig; }

    @Override
    public void displayRole() {
        System.out.println("Role: Faculty");
    }
}