import java.util.Scanner;

public class Palindrome_12
{
    public static void main(String[] args) {

        int number; // local variable to store the value
        int c; // extra variable to hold the vaule of results
        int r; // variable to hold remainder
        int add= 0;


        System.out.println(); // just for space purpose


        Scanner scanner =new Scanner(System.in);
        System.out.print("Please Enter any Number ");
        number = scanner.nextInt();   //  to store the integer value in to int variable
        c=number;

        while (number>0)   // number must be greater than 0 to run the further condition

        {
            r= number%10;
            add=(add*10)+ r;
            number=number/10;
        }
         if (c==add)
             System.out.println(" Entered Number IS Palindrome Number ");
         else
             System.out.println("Entered Number IS Not Palindrome Number ");


    }
}
