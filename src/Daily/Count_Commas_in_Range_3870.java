package Daily;

public class Count_Commas_in_Range_3870 {
    class Solution {
        public int countCommas(int n) {
            return (n > 999 ? 1 : 0) * (n - 999);
        }
    }

    public static void main(String[] args) {

    }
}
