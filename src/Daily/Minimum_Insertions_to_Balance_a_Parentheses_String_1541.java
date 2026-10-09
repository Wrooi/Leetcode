package Daily;

public class Minimum_Insertions_to_Balance_a_Parentheses_String_1541 {
    class Solution {
        public int minInsertions(String s) {
            int insertions = 0;
            int leftCount = 0;
            int length = s.length();
            int index = 0;
            while (index < length) {
                char c = s.charAt(index);
                if (c == '(') {
                    leftCount++;
                    index++;
                } else {
                    if (leftCount > 0) {
                        leftCount--;
                    } else {
                        insertions++;
                    }
                    if (index < length - 1 && s.charAt(index + 1) == ')') {
                        index += 2;
                    } else {
                        insertions++;
                        index++;
                    }
                }
            }
            insertions += leftCount * 2;
            return insertions;
        }
    }

    public static void main(String[] args) {

    }
}
