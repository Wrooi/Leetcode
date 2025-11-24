package Daily;

import java.awt.*;
import java.util.ArrayList;

public class Binary_Prefix_Divisible_By_5_1018 {
    class Solution {
        public List<Boolean> prefixesDivBy5(int[] nums) {
            List<Boolean> res = new ArrayList<>();
            int val = 0;

            for (int n : nums) {
                val = ((val << 1) + n) % 5;
                res.add(val == 0);
            }

            return res;
        }
    }

    public static void main(String[] args) {

    }
}
