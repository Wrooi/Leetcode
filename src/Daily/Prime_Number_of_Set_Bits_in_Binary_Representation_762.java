package Daily;

public class Prime_Number_of_Set_Bits_in_Binary_Representation_762 {
    class Solution {
        public int countPrimeSetBits(int left, int right) {
            int count=0;

            for (int i=left;i<=right;i++) {
                int setBits=Integer.bitCount(i);
                if (isPrime(setBits)) {
                    count++;
                }
            }
            return count;
        }

        private boolean isPrime(int n) {
            if (n<=1) {
                return false;
            }
            for (int i=2;i*i <= n;i++) {
                if (n%i==0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {

    }
}
