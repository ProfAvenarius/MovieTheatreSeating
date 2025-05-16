//This class creates an arrayList of random seats of random length to be reserved at initialization.

import java.util.ArrayList;

public class RandomSeatCreator {

    public static ArrayList<String> createRandomSeats() {
        int initialRandomNumberSold = (int) (Math.random() * 150 + 50);
        ArrayList<String> randomSeats = new ArrayList<>();
        for (int i = 0; i < initialRandomNumberSold; i++) {
            char row = (char) ('A' + (int)(Math.random()*26));
            int randomColumn = (int)(Math.random()*21 +10);
            String initialSeat = row + String.valueOf(randomColumn);
            if (!randomSeats.contains(initialSeat)) {
                randomSeats.add(initialSeat);   //If random duplication happens, it skips the
            }else {                             //duplicate and tries again.
                i--;
            }
        }
        return randomSeats;  //This gets called by Reserved Seats to build that array even before the
    }                        //user enters their own reservations.
}
