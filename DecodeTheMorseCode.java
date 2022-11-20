package CodeWars;

public class DecodeTheMorseCode {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String sentence = morseCode.trim();
        String res = "";
        String[] words = sentence.split("   ");
        int n = words.length;
        for (String word: words) {
            String[] chaArray = word.split(" ");
            for (String cha: chaArray) {
                String c = MorseCode.get(cha);
                res += c;
            }
            if (n > 1) {
                res += " ";
                n--;
            }
        }
        return res;
    }
}
