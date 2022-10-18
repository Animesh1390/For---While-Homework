import java.util.Scanner;

public class ReverseNumber_04
{

    public static void main(String[] args) {

            int number;
            int reverse =0; // declared variable & later on initialize to use it for multiplication

        System.out.print("\n");
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Please Enter any Five Digit Number  : ");
        number=scanner.nextInt(); // to store the integer value in to int variable

            while(number !=0 )
        {
            int i = number%10;
            reverse=reverse*10+i;
            number/=10;

        }
        System.out.println(" Entered Number In Reversed is  : " + reverse);  //  to print out output

    }

}
