package Daily;

public class Maximum_Nesting_Depth_of_Two_Valid_Parentheses_Strings_1111 {
    class Solution {
        public int[] maxDepthAfterSplit(String seq) {
            int n = seq.length();
            int[] r = new int[n];
            for (int i = 0; i < n; i++) {
                // '(' flips the index parity, ')' keeps it
                r[i] = (i & 1) ^ (seq.charAt(i) == '(' ? 1 : 0);
            }
            return r;
        }
    }

    public static void main(String[] args) {

    }
}
