
import java.util.Scanner;

public class Odd_Even_Sum
{
    public static void main(String[] args) {

        int number; // Local Variable to store the use Input
        int a=0;
       int odd =0 ; // variable initialised to store the value
       int even = 0;

        Scanner scanner = new Scanner(System.in); //            Scanner method
        System.out.println("Enter Any Five Digit Number :");
        number = scanner.nextInt();



        while ( number>0)
        {
            a = number%10;  // to find the remainder or last digit basically it's remainder of given number

              if( a%2==0)     // formula to find even number

                  even = even+a;

              else
                  odd = odd + a;

              number= number/ 10; // to eliminate last digit
        }
        System.out.println(" Sum of Even Number is : " + even );
        System.out.println(" Sum of Odd Number is : " + odd );



    }
}
