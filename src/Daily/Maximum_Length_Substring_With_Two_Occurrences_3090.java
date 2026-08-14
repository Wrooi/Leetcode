package Daily;

public class Maximum_Length_Substring_With_Two_Occurrences_3090 {
    class Solution {
        public int maximumLengthSubstring(String s) {
            int res = 0, l = 0;
            long mask = 0;

            for (int r = 0; r < s.length(); r++) {
                int k = (s.charAt(r) & 31) << 1;
                mask += 1L << k;

                while (((mask >> k) & 3) == 3)
                    mask -= 1L << ((s.charAt(l++) & 31) << 1);

                res = Math.max(res, r - l + 1);
            }

            return res;
        }
    }

    public static void main(String[] args) {

    }
}
