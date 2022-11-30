package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {
        // Your code here
        if (str.length() == 0) return new String[0];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            var st = new StringBuilder();
            int j = 0;
            if (str.charAt(i) == ' ')
                continue;
            for (var ch : str.split("")) {
                if (j == i)
                    st.append(ch.toUpperCase());
                else
                    st.append(ch);
                j++;
            }
            list.add(st.toString());
        }
        String[] result = new String[list.size()];
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        System.out.print(Arrays.toString(result));
        return result;
    }
}
