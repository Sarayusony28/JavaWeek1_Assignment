import java.util.Scanner;

public class Task3_ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline.

        System.out.print("Enter College Name: ");
        String collegeName = scanner.nextLine();

        System.out.print("Enter Branch: ");
        String branch = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.println("\n----- Entered Information -----");
        System.out.println("Full Name   : " + fullName);
        System.out.println("Age         : " + age);
        System.out.println("College     : " + collegeName);
        System.out.println("Branch      : " + branch);
        System.out.println("City        : " + city);

        scanner.close();
    }
}
