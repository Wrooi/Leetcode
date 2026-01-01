package Daily;

public class Plus_One_66 {
    class Solution {
        public int[] plusOne(int[] digits) {
            for(int i = digits.length - 1; i >= 0; i--) {
                if(digits[i] != 9) {
                    digits[i] += 1;
                    return digits;
                }
                digits[i] = 0;
            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
    }

    public static void main(String[] args) {

    }
}
