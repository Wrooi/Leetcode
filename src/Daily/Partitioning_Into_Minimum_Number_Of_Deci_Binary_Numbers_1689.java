package Daily;

public class Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers_1689 {
    class Solution {
        public int minPartitions(String n) {
            for (char ch = '9'; ch >= '0'; ch--) {
                if (n.indexOf(ch) != -1) {
                    return ch - '0';
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {

    }
}
