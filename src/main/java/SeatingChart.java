

public class SeatingChart {

    public static void seatingRows() {
        String[][] seats = new String[26][30];
        System.out.println(Colours.YELLOW);
        for (char row = 'A' ; row <= 'Z' ; row++) {
            if (row > 'A') {

                System.out.println();
            }
            for (int col = 1; col <= 30; col++) {
                seats[row-'A'][col-1] = row + String.valueOf(col);

                System.out.print(row + String.valueOf(col) + " ");

            }
        }
        System.out.println(Colours.RESET);
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
