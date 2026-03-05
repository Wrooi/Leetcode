package Daily;

public class Minimum_Changes_To_Make_Alternating_Binary_String_1758 {
    class Solution {
        public int minOperations(String s) {
            int count = 0, n = s.length();
            for (int i = 0; i < n; i++)
                count += (s.charAt(i) ^ i) & 1;

            return Math.min(count, n - count);
        }
    }

    public static void main(String[] args) {

    }
}
