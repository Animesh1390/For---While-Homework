import java.util.Scanner;

public class Fibonacci_Series
{

    public static void main(String[] args) // main method to run the program
    {

         int range, a=0 , b=1, c; // C variable declared to store value of a & b  // r



        Scanner scanner = new Scanner(System.in);
        System.out.print(" Input the range  \t : ");
        range = scanner.nextInt();

        for( int i=1; i<=range; i++)  // for loop method
        {
            System.out.println( a+ "\t");  // to print the out put
            c=a+b;
            a=b;
            b=c;
        }


    }
}
