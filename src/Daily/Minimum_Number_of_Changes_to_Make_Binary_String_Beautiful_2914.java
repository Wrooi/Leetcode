package Daily;

import java.util.stream.IntStream;

public class Minimum_Number_of_Changes_to_Make_Binary_String_Beautiful_2914 {
    class Solution {
        public int minChanges(String s) {
            return (int) IntStream.range(0, s.length() / 2).filter(i -> s.charAt(2 * i) != s.charAt(2 * i + 1)).count();
        }
    }

    public static void main(String[] args) {

    }
}
