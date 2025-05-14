import java.util.Arrays;

public class seatingChart {


    public static void seatingRows() {
        String[] rows = new String[26];
        for (char i = 'A' ; i <= 'Z' ; i++) {
            Arrays.fill(rows, i);
        }
        System.out.println(Arrays.toString(rows));
        return;
    }
}
