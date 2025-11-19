package Daily;

public class Keep_Multiplying_Found_Values_by_Two_2154 {
    public int findFinalValue(int[] nums, int k) {
        int bits = 0;
        for (int num : nums) {
            if (num % k != 0) continue;
            int n = num / k;
            if ((n & (n - 1)) == 0)
                bits |= n;
        }
        bits++;
        return k * (bits & -bits);
    }
}

//class Main {
//    public static void main(String[] args) {
//        Keep_Multiplying_Found_Values_by_Two_2154 solution = new Keep_Multiplying_Found_Values_by_Two_2154();
//    }
//}
