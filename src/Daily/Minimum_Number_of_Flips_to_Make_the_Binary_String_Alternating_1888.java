package Daily;

public class Minimum_Number_of_Flips_to_Make_the_Binary_String_Alternating_1888 {
    class Solution {
        public int minFlips(String s) {
            int n = s.length();
            int res = n;
            int[] op = {0, 0};

            for (int i = 0; i < n; i++)
                op[(s.charAt(i) ^ i) & 1]++;

            for (int i = 0; i < n; i++) {
                op[(s.charAt(i) ^ i) & 1]--;
                op[(s.charAt(i) ^ (n + i)) & 1]++;
                res = Math.min(res, Math.min(op[0], op[1]));
            }

            return res;
        }
    }

    public static void main(String[] args) {

    }
}
