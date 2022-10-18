import java.util.Scanner;

public class Sum_WhileLoop_10
{

    public static void main(String[] args) {   // main method

        int number; // Variable to store the number
        int sum=0; // Variable sum.  0 becasue if we add anything in 0 it will remain same & to store the results
        int remainder;


        System.out.println();   // just for space purpose

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter any Five Digit Number : ");
        number = scanner.nextInt();


        while (number>0)
        {
             remainder= number%10;
             sum= sum+remainder;
             number = number/10;

        }
        System.out.println(" Sum of Entered Number is  : " + sum); // to print the output

    }
}
