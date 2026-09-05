package Daily;

public class Smallest_Stable_Index_II_3904 {
    class Solution {
        public int firstStableIndex(int[] nums, int k) {
            int maxSoFar = -1;
            int cand = 0, max = 0;

            for (int i = 0; i < nums.length; i++) {
                maxSoFar = Math.max(maxSoFar, nums[i]);

                if (i == cand) max = maxSoFar;

                if (nums[i] < max - k)
                    cand = i + 1;
            }

            return cand < nums.length ? cand : -1;
        }
    }

    public static void main(String[] args) {

    }
}
