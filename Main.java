import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Student> students = new HashMap<>();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students.put(id, new Student(id, name, marks));

                    System.out.println("Student Added!");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No Students Found.");
                    } else {
                        for (Student s : students.values()) {
                            s.display();
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();

                    Student s = students.get(id);

                    if (s != null) {
                        s.display();
                    } else {
                        System.out.println("Student Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();

                    if (students.containsKey(id)) {
                        students.remove(id);
                        System.out.println("Student Deleted!");
                    } else {
                        System.out.println("Student Not Found.");
                    }

                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}