package Daily;

public class Maximum_Distance_Between_a_Pair_of_Values_1855 {
    class Solution {
        public int maxDistance(int[] A, int[] B) {
            int i, j;

            for (i = 0, j = 0; i < A.length && j < B.length; j++)
                if (A[i] > B[j])
                    i++;

            return Math.max(0, j - i - 1);
        }
    }

    public static void main(String[] args) {

    }
}
