import java.util.ArrayList;


public class AvailableSeats {
    public static void displayAvailableSeats(ArrayList<String> reservedSeats) {
//        String[][] allseats = SeatingChart.seatingRows();

        System.out.println("Available seats: ");
        System.out.println(Colours.GREEN);

        for(char row = 'A'; row <= 'Z'; row++) {
            if (row > 'A') {
                System.out.println();
            }
            for (int col = 10; col <= 30; col++) {
                String currentSeat = row + String.valueOf(col);
                if (!reservedSeats.contains(currentSeat)) {
                    System.out.print(currentSeat + " ");
                }else {
                    System.out.print(Colours.RED);
                    System.out.print("XXX ");
                    System.out.print(Colours.GREEN);
                }
            }
        }
        System.out.println(Colours.RESET);
        System.out.println();

    }
}
