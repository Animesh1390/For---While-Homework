import java.util.Scanner;

public class FactorialNumber_05
{

    public static void main(String[] args) {

        int number;             // Local variable
        int  result = (1);      // local variable

        System.out.println();   // just for extra space
        Scanner scanner =new Scanner(System.in);
        System.out.print(" Entered any Number Please  : ");
        number = scanner.nextInt();

        for(int i=1; i<=number; i++)
        {
            result = result*i; // results variable addedd to store the results

        }
        System.out.println(" Factorial for Entered Number is :  " +  result);

    }




}
