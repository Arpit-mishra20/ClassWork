import java.util.Scanner;

class Student {
    int rollNumber, age;
    String name;
    char grade;
    Student next;

    Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

class StudentLinkedList {
    private Student head;

    void addStudent(int rollNumber, String name, int age, char grade, int position) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (position == 1) {
            newStudent.next = head;
            head = newStudent;
            return;
        }
        Student temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) temp = temp.next;
        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    void deleteStudent(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) temp = temp.next;
        if (temp.next == null) {
            System.out.println("Student not found!");
            return;
        }
        temp.next = temp.next.next;
    }

    void searchStudent(int rollNumber) {
        for (Student temp = head; temp != null; temp = temp.next) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Student Found: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    void updateStudentGrade(int rollNumber, char newGrade) {
        for (Student temp = head; temp != null; temp = temp.next) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    void displayStudents() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }
        for (Student temp = head; temp != null; temp = temp.next) {
            System.out.println("Roll No: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
        }
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentLinkedList studentList = new StudentLinkedList();
        while (true) {
            System.out.println("\n1. Add Student\n2. Delete Student\n3. Search Student\n4. Update Student Grade\n5. Display All Students\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 6) break;

            int rollNumber, age, position;
            String name;
            char grade;
            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number, Name, Age, Grade, Position: ");
                    rollNumber = scanner.nextInt(); name = scanner.next(); age = scanner.nextInt(); grade = scanner.next().charAt(0); position = scanner.nextInt();
                    studentList.addStudent(rollNumber, name, age, grade, position);
                    break;
                case 2:
                    System.out.print("Enter Roll Number to Delete: ");
                    studentList.deleteStudent(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    studentList.searchStudent(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Roll Number and New Grade: ");
                    rollNumber = scanner.nextInt(); grade = scanner.next().charAt(0);
                    studentList.updateStudentGrade(rollNumber, grade);
                    break;
                case 5:
                    studentList.displayStudents();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}