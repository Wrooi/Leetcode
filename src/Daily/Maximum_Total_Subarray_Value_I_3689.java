package Daily;

public class Maximum_Total_Subarray_Value_I_3689 {
    class Solution {
        public long maxTotalValue(int[] A, int k) {
            int min = A[0], max = A[0];

            for (int n : A) {
                min = Math.min(min, n);
                max = Math.max(max, n);
            }

            return (long) (max - min) * k;
        }
    }

    public static void main(String[] args) {

    }
}
