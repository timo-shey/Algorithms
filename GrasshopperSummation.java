package CodeWars;

public class GrasshopperSummation {
    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
