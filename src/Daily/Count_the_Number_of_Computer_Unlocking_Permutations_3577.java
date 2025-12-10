package Daily;

public class Count_the_Number_of_Computer_Unlocking_Permutations_3577 {
    class Solution {
        static final int MOD = 1_000_000_007;

        public int countPermutations(int[] comp) {
            int n = comp.length;
            int first = comp[0];

            // Check that first is the unique minimum
            for (int i = 1; i < n; i++) {
                if (comp[i] <= first) return 0;
            }

            // Compute factorial (n-1)!
            long fact = 1;
            for (int i = 2; i < n; i++) {
                fact = (fact * i) % MOD;
            }

            return (int) fact;
        }
    }

    public static void main(String[] args) {

    }
}
