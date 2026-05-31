package Daily;
import java.util.*;

public class Destroying_Asteroids_2126 {
    class Solution {
        public boolean asteroidsDestroyed(int mass, int[] asteroids) {
            Arrays.sort(asteroids);

            long currentMass = mass;

            for (int asteroid : asteroids) {
                if (currentMass < asteroid) {
                    return false;
                }

                currentMass += asteroid;
            }

            return true;
        }
    }

    public static void main(String[] args) {

    }
}
