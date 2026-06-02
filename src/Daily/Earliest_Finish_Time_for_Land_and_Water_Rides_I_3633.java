package Daily;

public class Earliest_Finish_Time_for_Land_and_Water_Rides_I_3633 {
    class Solution {
        public int earliestFinishTime(int[] startL, int[] durL, int[] startW, int[] durW) {
            int minL = 3000, minW = minL, res = minW;
            int n = startL.length;
            int m = startW.length;

            for (int i = 0; i < n; i++)
                minL = Math.min(minL, startL[i] + durL[i]);

            for (int i = 0; i < m; i++) {
                minW = Math.min(minW, startW[i] + durW[i]);
                res = Math.min(res, Math.max(minL, startW[i]) + durW[i]);
            }

            for (int i = 0; i < n; i++)
                res = Math.min(res, Math.max(minW, startL[i]) + durL[i]);

            return res;
        }
    }
    
    public static void main(String[] args) {

    }
}
