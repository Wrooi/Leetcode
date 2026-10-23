package Daily;

public class Maximum_K_to_Sort_a_Permutation_3644 {
    class Solution {
        public int sortPermutation(int[] nums) {
            int k = -1;  // all bits set: nothing misplaced yet
            for (int i = 0; i < nums.length; i++)
                if (nums[i] != i) {  // this number has to move
                    k &= nums[i];  // keep only the bits it shares
                    if (k == 0) return 0;  // bits only disappear, so 0 stays 0
                }
            return Math.max(k, 0);  // -1 means nothing has to move
        }
    }

    public static void main(String[] args) {

    }
}
