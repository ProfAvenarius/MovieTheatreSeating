import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("|=== Theatre Seating System Menu ===|");
            System.out.println("1. View Full Seating Chart.");
            System.out.println("2. View Available Seats Only.");
            System.out.println("3. View Purchased Seats Only.");
            System.out.println("4. Reserve Seats.");
            System.out.println("5. Cancel Seats.");
            System.out.println("6. Exit");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    SeatingChart.seatingRows();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    ReserveSeats.reserveSeats();
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Thank you for using the Theatre Seating System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }while(choice != 6);
        scanner.close();
    }
}
