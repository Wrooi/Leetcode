package Daily;

public class Maximum_Product_of_Two_Elements_in_an_Array_v {
    class Solution {
        public int maxProduct(int[] nums) {
            int n = nums.length;
            int max = 0;

            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    max = Math.max(
                            (nums[i] - 1) * (nums[j] - 1),
                            max
                    );
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {

    }
}
