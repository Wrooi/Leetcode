package Daily;

public class Minimum_Time_Visiting_All_Points_1266 {
    class Solution {
        public int minTimeToVisitAllPoints(int[][] p) {
            int ans = 0;
            for (int i = 1; i < p.length; i++) {
                ans += Math.max(
                        Math.abs(p[i][0] - p[i - 1][0]),
                        Math.abs(p[i][1] - p[i - 1][1])
                );
            }
            return ans;
        }
    }

    public static void main(String[] args) {

    }
}
