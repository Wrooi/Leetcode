package Daily;

public class Remove_Outermost_Parentheses_1021 {
    class Solution {
        public String removeOuterParentheses(String s) {
            StringBuilder sb = new StringBuilder();
            int lvl = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if ((c == '(' && lvl++ > 0) ||
                        (c == ')' && --lvl > 0))
                    sb.append(c);

            }

            return sb.toString();
        }
    }

    public static void main(String[] args) {

    }
}
