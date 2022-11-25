package CodeWars;

public class HowGoodAreYou {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        int sumArr = yourPoints;
        for(int n: classPoints){
            sumArr += n;
        }
        int avg = sumArr / (classPoints.length + 1);
        return yourPoints > avg;
    }
}
