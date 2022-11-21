package CodeWars;

public class DnaToRnaConversion {
    public String dnaToRna(String dna) {
        if (dna.length() == 0) return "";
        var res = new StringBuilder(0);
        for (String ch: dna.split("")) {
            if (ch.equals("T")) {
                res.append("U");
            }
            else {
                res.append(ch);
            }
        }
        return res.toString();  // Do your magic!
    }
}
