public class Assi2_Ques14 {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers from 1 to 100 are:");

        for (int i = 1; i <= 100; i++) {
            int original = i;
            int num = i;
            int reverse = 0;

            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }

            if (original == reverse) {
                System.out.print(i + " ");
            }
        }
    }
}
