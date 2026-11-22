package Daily;

import java.util.stream.IntStream;

public class Check_if_All_As_Appears_Before_All_Bs_2124 {
    class Solution {
        public boolean checkString(String s) {
            return IntStream.range(1, s.length()).allMatch(i -> s.charAt(i - 1) <= s.charAt(i));
        }
    }

    public static void main(String[] args) {

    }
}
