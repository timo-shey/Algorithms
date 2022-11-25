package CodeWars;

public class Isograms {
    public static boolean  isIsogram(String str) {
        // ...
        String lower = str.toLowerCase();
        String[] arr = lower.split("");
        Set<String> unique = new HashSet<String>();
        for (String c: arr){
            unique.add(c);
        }
        return arr.length == unique.size();
    }
}
