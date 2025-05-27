import java.util.Scanner;

public class Assi2_Ques10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int r = 0;
        int org = n;
        System.out.println("************************");
        System.out.println("orginal number "+org);
        while (n != 0) {
            int d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        System.out.println("reversed number "+r);
        System.out.println("************************");

        if(org == r){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
        System.out.println("************************");
    }
}
