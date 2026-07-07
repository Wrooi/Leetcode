package Daily;

public class Concatenate_Non_Zero_Digits_and_Multiply_by_Sum_I_3754 {
    class Solution {
        public long sumAndMultiply(int n) {
            long x = 0, s = 0;
            for (char c : String.valueOf(n).toCharArray())
                if (c != '0') {
                    x = x * 10 + c - '0';
                    s += c - '0';
                }
            return x * s;
        }
    }

    public static void main(String[] args) {

    }
}
