public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int aLength = a.length();
        int bLength = b.length();
        int lA = 0;
        int lB = 0;
        int l = 0;
        while (aLength > 0 || bLength > 0) {// 1 0
            if (aLength <= 0) {
                lA = 0;
            } else {
                lA = a.charAt(aLength - 1) - '0';//1
            }
            if (bLength <= 0) {
                lB = 0;
            } else {
                lB = b.charAt(bLength - 1) - '0';//1
            }
            l = l + lA + lB;//2
            builder.insert(0, l % 2);//0
            l /= 2;//1
            aLength--;//1
            bLength--;//0
        }
        if (l == 1) {
            builder.insert(0, l);
        }
        return builder.toString();
    }
}
