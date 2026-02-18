package Daily;

public class Binary_Number_with_Alternating_Bits_693 {
    class Solution {
        public boolean hasAlternatingBits(int n) {
            int x = n ^ (n >> 1);
            return (x & (x + 1)) == 0;
        }
    }

    public static void main(String[] args) {

    }
}
