package lab8;

public abstract class Employee extends Person{
    private String position;
    private double salary;
    private int experience;
    private String department;

    public Employee(String name, String surname, String gender, boolean active, String position, double salary, int experience, String department) {
        super(name, surname, gender, active);
        this.position = position;
        this.salary = salary;
        this.experience = experience;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
