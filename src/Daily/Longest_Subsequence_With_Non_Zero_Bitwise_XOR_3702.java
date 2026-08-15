package Daily;

public class Longest_Subsequence_With_Non_Zero_Bitwise_XOR_3702 {
    class Solution {
        public int longestSubsequence(int[] A) {
            int tot = 0, n = A.length;
            boolean nonZero = false;

            for (int x : A) {
                nonZero |= x > 0;
                tot ^= x;
            }

            if (!nonZero) return 0;
            return tot == 0 ? n - 1 : n;
        }
    }

    public static void main(String[] args) {

    }
}
