package Daily;

public class Minimum_Element_After_Replacement_With_Digit_Sum_3300 {
    class Solution {
        public int minElement(int[] nums) {
            int res = 36;
            for (int n : nums)
                res = Math.min(res, n - 9 * ((n/10) + (n/100) + (n/1000) + (n/10000)));

            return res;
        }
    }

    public static void main(String[] args) {

    }
}
