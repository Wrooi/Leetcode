package Daily;

public class Smallest_Index_With_Digit_Sum_Equal_to_Index_3550 {
    class Solution {
        public int smallestIndex(int[] nums) {

            for (int i = 0; i < nums.length; i++) {
                int x = nums[i];
                int sum = 0;

                while (x > 0) {
                    sum += x % 10;
                    x /= 10;
                }

                if (sum == i)
                    return i;
            }

            return -1;
        }
    }

    public static void main(String[] args) {

    }
}
