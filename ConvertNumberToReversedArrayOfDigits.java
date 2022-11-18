package CodeWars;

public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        // Code here
        String str = String.valueOf(n);
        int len = str.length();
        int nums[] = new int[len];
        int j = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            nums[j] = Character.getNumericValue(str.charAt(i));
            j++;
        }
        return nums;
    }
}
