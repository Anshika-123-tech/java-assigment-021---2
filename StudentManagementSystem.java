import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== Student Record Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Student s = new Student();
                    s.inputDetails(sc);
                    list.add(s);
                    System.out.println("Student Added Successfully!\n");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("\nNo records found.\n");
                    } else {
                        for (Student st : list) {
                            System.out.println();
                            st.displayDetails();
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.\n");
            }
        }
    }
}
