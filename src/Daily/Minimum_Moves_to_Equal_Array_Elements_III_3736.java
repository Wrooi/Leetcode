package Daily;

public class Minimum_Moves_to_Equal_Array_Elements_III_3736 {
    class Solution {
        public int minMoves(int[] nums) {
            int max = 0;
            int sum = 0;
            for (int x : nums) {
                max = Math.max(max, x);
                sum += x;
            }
            return max * nums.length - sum;
        }
    }

    public static void main(String[] args) {

    }
}
