package Daily;

public class N_Repeated_Element_in_Size_2N_Array_961 {
    class Solution {
        public int repeatedNTimes(int[] A) {
            for (int i = 0; i < A.length - 2; i++)
                if (A[i] == A[i + 1] || A[i] == A[i + 2])
                    return A[i];
            return A[A.length - 1];
        }
    }

    public static void main(String[] args) {

    }
}
