package Daily;

public class Stone_Removal_Game_3360 {
    class Solution {
        public boolean canAliceWin(int n) {
            int m = (int) Math.sqrt(433 - 8 * n) - 1;
            return (m & 2) == 0;
        }
    }

    public static void main(String[] args) {

    }
}
