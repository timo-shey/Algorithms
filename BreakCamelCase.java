package CodeWars;
/*
Complete the solution so that the function will break up camel casing, using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
 */

public class BreakCamelCase {
    public static String camelCase(String input) {
        if (input.equals("")) return input;
        var res = new StringBuilder(0);
        for (var ch: input.split("")){
            if (ch.equals(ch.toUpperCase()))
                res.append(" ");
            res.append(ch);
        }
        return res.toString();
    }
}
