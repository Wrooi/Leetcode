package Daily;

import java.util.Arrays;

public class Sort_Integers_by_The_Number_of_1_Bits_1356 {
    class Solution {
        public int[] sortByBits(int[] arr) {
            Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);

            Arrays.sort(temp, (a, b) -> {
                int countA = Integer.bitCount(a);
                int countB = Integer.bitCount(b);

                if (countA == countB) {
                    return a - b;
                }
                return countA - countB;
            });

            for (int i = 0; i < arr.length; i++) {
                arr[i] = temp[i];
            }

            return arr;
        }
    }

    public static void main(String[] args) {

    }
}
