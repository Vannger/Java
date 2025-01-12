package lab9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add students to the group (max 15):");
        while (true) {
            if (group.getStudentCount() >= 15) {
                System.out.println("Group is full. You cannot add more students.");
                break;
            }

            System.out.println("Do you want to add a student? (y/n): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                try {
                    group.addStudent();
                } catch (Exception e) {
                    System.out.println("Error adding student: " + e.getMessage());
                }
            } else {
                break;
            }
        }

        System.out.println("\nCurrent list of students:");
        group.printStudents();

        try {
            System.out.println("\nDo you want to remove a student? (y/n): ");
            String removeInput = scanner.nextLine();
            if (removeInput.equalsIgnoreCase("y")) {
                System.out.println("Enter the index of the student to remove (0 to " + (group.getStudentCount() - 1) + "):");
                int index = Integer.parseInt(scanner.nextLine());
                group.removeStudent(index);
            }
        } catch (Exception e) {
            System.out.println("Error removing student: " + e.getMessage());
        }

        System.out.println("\nUpdated list of students:");
        group.printStudents();

        try {
            System.out.println("\nEnter student number to view (0 to " + (group.getStudentCount() - 1) + "):");
            int studentIndex = Integer.parseInt(scanner.nextLine());
            group.getStudent(studentIndex);
        } catch (Exception e) {
            System.out.println("Error accessing student: " + e.getMessage());
        }
    }
}
