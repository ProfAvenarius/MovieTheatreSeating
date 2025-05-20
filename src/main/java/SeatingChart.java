//First class coded, somewhat redundant now with AvailableSeats class as well, but this
// is where the "Array Theatre" was first built.

public class SeatingChart {

    public static String[][] seatingRows() {
        System.out.println(Colours.CYAN);
        System.out.println("                       |===THE ARRAY THEATRE SEATING CHART===|                  ");
//        System.out.println(Colours.YELLOW);
        String[][] seats = new String[26][21];
        System.out.println(Colours.YELLOW);
        for (char row = 'A' ; row <= 'Z' ; row++) {
            if (row > 'A') {

                System.out.println();
            }
            for (int col = 10; col <= 30; col++) {
                seats[row-'A'][col-10] = row + String.valueOf(col);

                System.out.print(row + String.valueOf(col) + " ");

            }//started col nums at 10 to keep all seats 3 digits.
        }
        System.out.println(Colours.RESET);
        System.out.println();
        System.out.println();
        System.out.println();

        return seats;
    }
}
