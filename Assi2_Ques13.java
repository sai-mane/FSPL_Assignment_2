public class Assi2_Ques13 {
            public static void main(String[] args) {
                System.out.println("Armstrong numbers from 1 to 1000 are:");

                for (int num = 1; num <= 1000; num++) {
                    int original = num;
                    int sum = 0;
                    int temp = num;
                    int digits = 0;
                    while (temp > 0) {
                        digits++;
                        temp /= 10;
                    }
                    temp = num;
                    while (temp > 0) {
                        int digit = temp % 10;
                        sum += Math.pow(digit, digits);
                        temp /= 10;
                    }

                    if (sum == original) {
                        System.out.print(original + " ");
                    }
                }
            }
        }
