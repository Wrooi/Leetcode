package Daily;

public class GCD_of_Odd_and_Even_Sums_3658 {
    class Solution {

        private int gcd(int x, int y) {
            return y == 0 ? x : gcd(y, x % y);
        }

        public int gcdOfOddEvenSums(int n) {
            return gcd(n * n, n * (n + 1));
        }
    }
    
    public static void main(String[] args) {

    }
}
