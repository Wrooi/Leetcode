package Daily;

public class Count_the_Number_of_Special_Characters_I_3120 {
    class Solution {
        public int numberOfSpecialChars(String word) {
            int lower = 0;
            int upper = 0;

            for(char ch : word.toCharArray()) {
                if(Character.isLowerCase(ch)) {
                    lower |= (1 << (ch - 'a'));
                }
                else {
                    upper |= (1 << (ch - 'A'));
                }
            }

            int common = lower & upper;

            // counting number of set bits
            return Integer.bitCount(common);
        }
    }

    public static void main(String[] args) {

    }
}
