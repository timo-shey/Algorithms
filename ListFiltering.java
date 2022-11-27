package CodeWars;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        var res = list.stream()
                .filter(item -> item instanceof Integer)
                .collect(Collectors.toList());
        return res;
    }
}
