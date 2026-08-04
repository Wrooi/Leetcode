package Daily;
import java.util.*;

public class Find_Missing_Elements_3731 {
    class Solution {
        public List<Integer> findMissingElements(int[] nums) {
            List<Integer> res = new ArrayList<>();
            boolean[] contains = new boolean[101];

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int ele : nums){
                min = Math.min(min, ele);
                max = Math.max(max, ele);
                contains[ele] = true;
            }

            for(int i = min; i <= max; i++){
                if(!contains[i]){
                    res.add(i);
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {

    }
}
