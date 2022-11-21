package CodeWars;

public class FakeBinary {
        public static String fakeBin(String numberString) {
            var res = new StringBuilder(0);
            for (int i = 0; i < numberString.length(); i++) {
                String d = (Character.getNumericValue(numberString.charAt(i)) < 5) ? "0" : "1";
                res.append(d);
            }
            return res.toString();
        }
}
