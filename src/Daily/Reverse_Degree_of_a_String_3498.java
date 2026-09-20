package Daily;

public class Reverse_Degree_of_a_String_3498 {
    class Solution {
        public int reverseDegree(String s) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                int reverseValue = 26 - (c - 'a');
                int position = i + 1;

                sum += reverseValue * position;
            }
            return sum;
        }
    }

    public static void main(String[] args) {

    }
}
