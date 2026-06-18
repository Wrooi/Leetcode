package Daily;

public class Angle_Between_Hands_of_a_Clock_1344 {
    class Solution {
        public double angleClock(int hour, int minutes) {
            double x = hour + minutes / 60.0;
            double diff = (11.0 * x) % 12.0;
            return Math.min(diff, 12.0 - diff) * 30.0;
        }
    }

    public static void main(String[] args) {

    }
}
