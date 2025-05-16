import java.util.ArrayList;
import java.util.Scanner;

public class ReserveSeats {
    private static ArrayList<String> reservedSeats = new ArrayList<String>();

    static { //Initializer block. Wanted this to run once, run first and run automatically.
        ArrayList<String> randomSeats = RandomSeatCreator.createRandomSeats();
        reservedSeats.addAll(randomSeats);// Initialize with random seats
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
        }

        System.out.println("Reserved seats: " + reservedSeats);
    }

    public static ArrayList<String> getReservedSeats() {
        return reservedSeats;
    }





}

