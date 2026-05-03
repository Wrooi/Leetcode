package Daily;

public class Rotate_String_796 {
    class Solution {
        public boolean rotateString(String s, String goal) {
            return s.length() == goal.length() && (s + s).contains(goal);
        }
    }

    public static void main(String[] args) {

    }
}
