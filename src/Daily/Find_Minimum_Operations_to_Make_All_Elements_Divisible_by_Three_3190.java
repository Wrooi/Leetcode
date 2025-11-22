package Daily;

import java.util.Arrays;

public class Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three_3190 {
    class Solution {
        public int minimumOperations(int[] nums) {
            int res = 0;
            for (int num : nums) {
                if (num % 3 != 0) res++;
            }
            return res;
        }
    }

    public static void main(String[] args) {

    }
}
