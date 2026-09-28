package Daily;

public class Maximum_Nesting_Depth_of_the_Parentheses_1614 {
    class Solution {
        public int maxDepth(String s) {
            int depth = 0;
            int r = 0;
            for (char c : s.toCharArray()) {
                if (c == ')') {
                    depth--;
                    continue;
                }
                // Digits and operators
                if (c != '(') continue;
                depth++;
                // New max only possible after '('
                if (depth > r) r = depth;
            }
            return r;
        }
    }
    
    public static void main(String[] args) {

    }
}
