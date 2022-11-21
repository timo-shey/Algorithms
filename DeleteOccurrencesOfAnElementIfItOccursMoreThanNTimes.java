package CodeWars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (var i : elements) {
            if( map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
            if (map.get(i) > maxOccurrences)
                continue;
            list.add(i);
        }
        System.out.println(list.size());
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
