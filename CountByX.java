package CodeWars;

public class CountByX {
    public static int[] countBy(int x, int n){
        // Your code here
        int nums[] = new int[n];
        for (int i = 1; i <= n; i++){
            nums[i-1] = x * i;
        }
        return nums;
    }
}
