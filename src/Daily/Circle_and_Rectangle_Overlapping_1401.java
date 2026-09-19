package Daily;

public class Circle_and_Rectangle_Overlapping_1401 {
    class Solution {
        public boolean checkOverlap(int r, int cx, int cy, int x1, int y1, int x2, int y2) {
            int x = Math.max(x1, Math.min(cx, x2)) - cx;
            int y = Math.max(y1, Math.min(cy, y2)) - cy;

            return x * x + y * y <= r * r;
        }
    }

    public static void main(String[] args) {

    }
}
