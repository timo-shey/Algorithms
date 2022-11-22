package CodeWars;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        int odd = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (var i : a) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        for (var i : map.keySet()) {
            if (map.get(i) % 2 == 1)
                odd = i;
        }
        return odd;
    }
}
