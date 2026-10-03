package Daily;

public class One_bit_and_2_bit_Characters_717 {
    class Solution {
        public boolean isOneBitCharacter(int[] bits) {
            final int n=bits.length;
            int i=0;
            while(i<n-1){
                i+=1+bits[i];
            }
            return i==n-1;
        }
    }

    public static void main(String[] args) {

    }
}
