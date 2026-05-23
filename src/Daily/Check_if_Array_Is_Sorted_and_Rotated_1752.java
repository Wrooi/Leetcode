package Daily;

public class Check_if_Array_Is_Sorted_and_Rotated_1752 {
    class Solution {
        public boolean check(int[] nums) {
            boolean fault = false;
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                if (nums[i] > nums[(i + 1) % n]) {
                    if (fault) return false;
                    fault = true;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {

    }
}
