package CodeWars;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        // Code here or
        String[] arr = numbers.split(" ");
        if (arr.length == 1){
            return arr[0] + " " + arr[0];
        }
        int lowest = Integer.parseInt(arr[0]);
        int highest = Integer.parseInt(arr[0]);
        for(String n: arr){
            if (lowest > Integer.parseInt(n)) lowest = Integer.parseInt(n);
            if (highest < Integer.parseInt(n)) highest = Integer.parseInt(n);
        }
        System.out.println(lowest);
        System.out.println(highest);
        return highest + " " + lowest;
    }
}
