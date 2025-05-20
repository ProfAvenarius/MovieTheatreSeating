import java.util.ArrayList;
import java.util.Scanner;

public class ReserveSeats {
    private static ArrayList<String> reservedSeats = new ArrayList<String>();

    static { //Initializer block. Wanted this to run once, run first and run automatically.
        ArrayList<String> randomSeats = RandomSeatCreator.createRandomSeats();
        reservedSeats.addAll(randomSeats);// Initialize seat chart with random seats
    }

    public static void reserveSeats() {
        Scanner scanner = new Scanner(System.in);
        int numSeats;
        String seat;

        System.out.println("Number of seats to reserve?");
        numSeats = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <numSeats; i++) {
            System.out.println("Enter the " + (i+1) + "/" + numSeats + " seat to reserve:");
            seat = scanner.nextLine();
            reservedSeats.add(seat);
            System.out.println("Seat " + seat + " has been reserved.");
            System.out.println();
        }
    }

    public static ArrayList<String> getReservedSeats() {
        return reservedSeats;
    }


    public static void cancelSeats() {
        Scanner scanner = new Scanner(System.in);
        int numCancels;
        String seatToCancel;

        System.out.println("Number of seats to cancel?");
        numCancels = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <numCancels; i++) {
            System.out.println("Enter the " + (i+1) + "/" + numCancels + " seat to cancel:");
            seatToCancel = scanner.nextLine();
            if (reservedSeats.contains(seatToCancel)) {
                reservedSeats.remove(seatToCancel);
                System.out.println("Seat " + seatToCancel + " has been removed.");
            }else {
                System.out.println("Seat " + seatToCancel + " is not currently reserved.");
                System.out.println();
            }
        }
    }
}