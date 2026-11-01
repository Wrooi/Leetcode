package Daily;
import java.util.Arrays;

public class Minimum_Moves_to_Equal_Array_Elements_453 {
    class Solution {
        public int minMoves(int[] nums) {
            int lo = Arrays.stream(nums).min().getAsInt(), moves = 0;
            for (int x : nums) moves += x - lo;
            return moves;
        }
    }

    public static void main(String[] args) {

    }
}
