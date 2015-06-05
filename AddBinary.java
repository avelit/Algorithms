public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int aLength = a.length();
        int bLength = b.length();
        int numA = 0;
        int numB = 0;
        int num = 0;
        while (aLength > 0 || bLength > 0) {
            if (aLength <= 0) {
                numA = 0;
            } else {
                numA = a.charAt(aLength - 1) - '0';
            }
            if (bLength <= 0) {
                numB = 0;
            } else {
                numB = b.charAt(bLength - 1) - '0';
            }
            num += numA + numB;
            builder.insert(0, num % 2);
            num /= 2;
            aLength--;
            bLength--;
        }
        if (num == 1) {
            builder.insert(0, num);
        }
        return builder.toString();
    }
}
