package Easy.DataStructAndAlgo.ArrayI;

class Q1_Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int[] n = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            n[i] = nums[i];
            n[nums.length + i] = nums[i];
        }
        return n;
    }
}

//class Main {
//    public static void main(String[] args) {
//        String first = args[0];
//        String second = args[1];
//        System.out.println("Words given: " + first + ", " + second);
//        boolean isSame = first.equals(second);
//        System.out.println("They are the same: " + isSame);
//    }
//}