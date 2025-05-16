import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> reservedSeats = ReserveSeats.getReservedSeats();
        int choice;
        do {
            System.out.println("|=== Theatre Seating System Menu ===|");
            System.out.println("    1. View Full Seating Chart.");
            System.out.println("    2. View Available Seats Only.");
            System.out.println("    3. Reserve Seats.");
            System.out.println("    4. Cancel Seats.");
            System.out.println("    5. Exit");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    SeatingChart.seatingRows();
                    break;
                case 2:
                    AvailableSeats.displayAvailableSeats(reservedSeats);
                    break;
                case 3:
                    ReserveSeats.reserveSeats();
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Thank you for using the Theatre Seating System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }while(choice != 5);
        scanner.close();
    }
}
