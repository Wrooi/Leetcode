package Daily;

import java.util.Arrays;

public class Minimum_Cost_of_Buying_Candies_With_Discount_2144 {
    class Solution {
        public int minimumCost(int[] cost) {
            Arrays.sort(cost);
            int total = 0;

            for (int i = cost.length - 1; i >= 0; i -= 3) {
                total += cost[i];
                if (i - 1 >= 0)
                    total += cost[i - 1];
            }

            return total;
        }
    }

    public static void main(String[] args) {

    }
}
