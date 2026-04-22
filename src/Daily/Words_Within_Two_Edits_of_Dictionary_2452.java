package Daily;
import java.util.*;

public class Words_Within_Two_Edits_of_Dictionary_2452 {
    class Solution {
        boolean hasMatch(String query, String[] dictionary) {
            boolean found = false;
            for (String dict : dictionary) {
                int diffMax = 2;
                for (int i=0;i<dict.length();i++) {
                    if (dict.charAt(i) != query.charAt(i)) {
                        diffMax--;
                    }
                    if (diffMax < 0) {
                        break;
                    }
                }
                if (diffMax >= 0) {
                    return true;
                }
            }

            return found;
        }

        public List<String> twoEditWords(String[] queries, String[] dictionary) {

            List<String> result = new ArrayList<>();
            for (String query : queries) {
                if (hasMatch(query, dictionary)) {
                    result.add(query);
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {

    }
}
