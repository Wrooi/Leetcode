package Daily;

public class Check_Divisibility_by_Digit_Sum_and_Product_3622 {
    class Solution {
        public boolean checkDivisibility(int n) {
            int sumDigit = 0;
            int productDigit = 1;
            int num = n;


            while (num > 0) {
                sumDigit += num % 10;
                productDigit *= num % 10;
                num /= 10;
            }


            return n % (sumDigit + productDigit) == 0;
        }
    }

    public static void main(String[] args) {

    }
}
