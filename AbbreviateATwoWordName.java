package CodeWars;

/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F
 */

public class AbbreviateATwoWordName {
    public static String abbrevName(String name) {
        String initials = "";
        String[] arr = name.split(" ");
        for(int i = 0; i < arr.length; i++) {
            initials += Character.toString(arr[i].charAt(0)).toUpperCase();
            if (i == 0)
                initials += ".";
        }
        return initials;
    }
}
