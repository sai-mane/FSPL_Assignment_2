import java.util.Scanner;

import static java.lang.Math.pow;

public class Assi2_Ques12 {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int orginalnum=number,sum=0,digits = 0;


            while(number!=0){
                number/=10;
                digits++;
            }
            number=orginalnum;
            System.out.println(number);//153 //3

            while (number != 0) {
                int digit = number % 10;
                sum += pow(digit, digits);
                number /= 10;
            }
            System.out.println("After "+sum);//153

            if (sum == orginalnum) {
                System.out.println(orginalnum + " is an Armstrong number.");
            } else {
                System.out.println(orginalnum + " is not an Armstrong number.");
            }
        }
    }
