package CodeWars;

public class Mumbling {
    public static String accum(String s) {
        // your code
        String[] arr = s.split("");
        for(int i = 0; i < arr.length; i++){
            String cap = String.valueOf(s.charAt(i)).toUpperCase();
            if (i == 0){
                arr[i] = cap;
                continue;
            }
            String res = cap;
            int j = i;
            while(j > 0){
                res += String.valueOf(s.charAt(i)).toLowerCase();
                j--;
            }
            arr[i] = res;
        }
        String result = String.join("-", arr);
        return result;
    }
}
