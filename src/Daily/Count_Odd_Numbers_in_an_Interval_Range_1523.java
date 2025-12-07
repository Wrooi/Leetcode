package Daily;

public class Count_Odd_Numbers_in_an_Interval_Range_1523 {
    class Solution {
        public int countOdds(int low, int high) {
            return (high+(high&1)-low+(low&1))>>1;
        }
    }

    public static void main(String[] args) {

    }
}
