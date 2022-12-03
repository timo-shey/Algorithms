package CodeWars;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int passengers = 0;
        for (var list: stops) {
            passengers += list[0];
            passengers -= list[1];
        }
        return passengers;
    }
}
