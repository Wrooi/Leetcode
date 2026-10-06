package Daily;

public class Minimum_Add_to_Make_Parentheses_Valid_921 {
    class Solution {
        public int minAddToMakeValid(String s) {
            int open = 0, add = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    open++;
                } else {
                    if (open > 0) {
                        open--;
                    } else {
                        add++;
                    }
                }
            }
            return add + open;
        }
    }

    public static void main(String[] args) {

    }
}
