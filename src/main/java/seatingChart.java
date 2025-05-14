import java.util.Arrays;

public class seatingChart {


    public static void seatingRows() {
        String[][] seats = new String[26][42];
        for (char row = 'A' ; row <= 'Z' ; row++) {
            if (row > 'A') {
                System.out.println();
            }
            for (int col = 1; col <= 42; col++) {
                seats[row-'A'][col-1] = row + String.valueOf(col);
                System.out.print(row + String.valueOf(col) + " ");
            }
        }
    }

    public static void main(String[] args) {
        seatingRows();
    }
}
