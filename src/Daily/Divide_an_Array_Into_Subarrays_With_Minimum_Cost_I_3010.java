package Daily;

public class Divide_an_Array_Into_Subarrays_With_Minimum_Cost_I_3010 {
    class Solution {
        public int minimumCost(int[] A) {
            int a = 51, b = 51;

            for (int i = 1; i < A.length; i++) {
                if (A[i] < a) {
                    b = a;
                    a = A[i];
                } else if (A[i] < b)
                    b = A[i];

                if (a == 1 && b == 1) break;
            }

            return A[0] + a + b;
        }
    }

    public static void main(String[] args) {

    }
}
