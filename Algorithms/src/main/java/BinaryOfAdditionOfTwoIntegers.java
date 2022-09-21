public class BinaryOfAdditionOfTwoIntegers {
    public static String binary(int a, int b) {
        int sum = a + b;
        int bit = 0;
        String binary = "";

        while (sum != 0) {
            bit = sum % 2;
            binary += bit;
            sum /= 2;
        }

        String reversedBinary = "";
        char[] binaryChar = binary.toCharArray();

        for (int i = binaryChar.length - 1; i >= 0; i--) {
            reversedBinary += binaryChar[i];
        }
        return reversedBinary;
    }
}
