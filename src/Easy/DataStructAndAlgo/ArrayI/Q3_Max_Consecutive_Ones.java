package Easy.DataStructAndAlgo.ArrayI;

public class Q3_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        // max: holds the max streak found so far
        // curr: holds the current streak
        int max = 0;
        int curr = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                // If it's 1, increment the current streak
                curr++;
            }
            else if(nums[i] == 0) {
                // If it's 0, the streak is broken
                // Compare the just-ended streak (curr) with max
                max = Math.max(max,curr);
                // Reset curr for the next streak
                curr = 0;
            }
        }

        // Final check: handles cases where the array ends with 1s
        // e.g., [1, 1, 0, 1, 1, 1]
        // At loop end: max = 2, curr = 3. We must do one last check.
        return Math.max(max,curr);
    }
}

//class Main {
//    public static void main(String[] args) {
//        Q3_Max_Consecutive_Ones solution = new Q3_Max_Consecutive_Ones();
//    }
//}