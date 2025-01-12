package lab9;

import java.util.Scanner;

public class Student {
    private int age;
    private String gender;
    private String firstName;
    private String lastName;
    private String patronymic;
    private int course;
    private double averageGrade;

    public Student() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter patronymic: ");
        this.patronymic = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();

        try {
            setAge(age);
        } catch (NotCorrectAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter gender (Male/Female): ");
        this.gender = scanner.next();

        System.out.print("Enter course: ");
        this.course = scanner.nextInt();

        System.out.print("Enter average grade: ");
        this.averageGrade = scanner.nextDouble();
    }

    public Student(int age, String gender, String firstName, String lastName, String patronymic, int course, double averageGrade) {
        this.age = age;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NotCorrectAgeException {
        if (age < 16 || age > 60) {
            throw new NotCorrectAgeException("Age must be between 16 and 60!");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + firstName + " " + lastName + " " + patronymic + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
