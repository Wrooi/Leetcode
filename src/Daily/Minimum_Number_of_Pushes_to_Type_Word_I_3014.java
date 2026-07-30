package Daily;

public class Minimum_Number_of_Pushes_to_Type_Word_I_3014 {
    class Solution {
        public int minimumPushes(String word) {
            int n = word.length();
            int m = (n - 1) / 8 + 1;
            return m * (m - 1) * 4 + (n - (m - 1) * 8) * m;
        }
    }

    public static void main(String[] args) {

    }
}
