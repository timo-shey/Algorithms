package CodeWars;

import java.util.HashMap;

public class FindTheUniqueNumber {
    public static double findUnique(double arr[]) {
        // Do the magic
        double unique = 0;
        var map = new HashMap<Double, Integer>();
        for (var n : arr) {
            if (map.get(n) == null)
                map.put(n, 0);
            else
                map.put(n, map.get(n) + 1);
        }
        for (var k : map.keySet())
            if (map.get(k) == 0)
                unique = k;
        return unique;
    }
}
