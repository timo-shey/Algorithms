public class ReverseString {

    public static String stringReversal(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }
    public static String stringReversalII(String input) {
        String[] inputArr = input.split("");
        String output = "";
        for (int i = inputArr.length-1; i >= 0; i--) {
            output += inputArr[i];
        }
        return output;
    }
    public static String stringReversalIII(String input) {
        String output = "";
        for (int i = input.length()-1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }
}
