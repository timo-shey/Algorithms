package CodeWars;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        //Code goes here!
        int len = word.length();
        if (len == 1) return "" + word.charAt(len - 1);
        int mid = (int) len / 2;
        if (len % 2 == 1){
            String arr[] = word.split("");
            return arr[mid];
        };
        return word.substring(mid-1, mid+1);
    }
}
