package CodeWars;

public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int count = 0;
        for (var i : arrayOfSheeps) {
            if (i == null)
                continue;
            if (i == true)
                count++;
        }
        return count;
    }
}

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int present = 0;
        for (Boolean i : arrayOfSheeps) {
            if (i == null)
                continue;
            if (i == false)
                continue;
            if (i == true)
                present++;
        }


        return present;
    }
}