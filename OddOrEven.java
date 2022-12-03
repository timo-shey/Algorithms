package CodeWars;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        // your code
        int sum = 0;
        for (int n: array){
            sum += n;
        }
        return (sum % 2 == 0) ? "even": "odd";
    }
}
