package Daily;
import java.util.*;

public class Subarrays_Distinct_Element_Sum_of_Squares_I_2913 {
    class Solution {
        public int sumCounts(List<Integer> nums) {
            int n = nums.size();
            int res = 0;
            for (int i = 0; i < n; i++) {
                Set<Integer> s = new HashSet<>();
                for (int j = i; j < n; j++) {
                    s.add(nums.get(j));
                    int d = s.size();
                    res += d * d;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {

    }
}
