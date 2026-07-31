package Daily;
import java.util.*;

public class Minimum_Number_of_Pushes_to_Type_Word_II_3016 {
    class Solution {
        public int minimumPushes(String word) {
            int[] hashTable = new int[26];

            for(char ch : word.toCharArray()){
                hashTable[ch - 'a']++;
            }

            int minPushing = 0;

            Arrays.sort(hashTable);

            for(int i = 25, pushCnt = 0; i >= 0; i--){
                int currEleIdx = 25 - i;

                if(currEleIdx % 8 == 0)
                    pushCnt++;

                minPushing += hashTable[i] * pushCnt;
            }

            return minPushing;
        }
    }

    public static void main(String[] args) {

    }
}
