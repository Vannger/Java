package lab9;

import java.util.ArrayList;

public class Group {
    private ArrayList<Student> students;
    private static final int MAX_SIZE = 15;
    private static final int MIN_SIZE = 3;

    public Group() {
        students = new ArrayList<>();
    }

    public void addStudent() throws Exception {
        if (students.size() < MAX_SIZE) {
            Student newStudent = new Student(); // Create a new student via console
            students.add(newStudent);
        } else {
            throw new Exception("Group is full. Cannot add more students.");
        }
    }

    public void addStudent(Student student) throws Exception {
        if (students.size() < MAX_SIZE) {
            students.add(student);
        } else {
            throw new Exception("Group is full. Cannot add more students.");
        }
    }

    public void removeStudent(int index) throws Exception {
        if (students.size() <= MIN_SIZE) {
            throw new Exception("Cannot remove a student. The group must have at least " + MIN_SIZE + " students.");
        } else if (index >= 0 && index < students.size()) {
            students.remove(index);
            System.out.println("Student removed successfully.");
        } else {
            throw new Exception("Invalid index.");
        }
    }

    public void getStudent(int index) throws Exception {
        if (index >= 0 && index < students.size()) {
            System.out.println(students.get(index));
        } else {
            throw new Exception("Invalid student number.");
        }
    }

    public void printStudents() {
        if (students.isEmpty()) {
            System.out.println("The group is empty.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public int getStudentCount() {
        return students.size();
    }
}
