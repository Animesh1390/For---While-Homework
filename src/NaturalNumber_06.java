import java.util.Scanner;

public class NaturalNumber_06
{

    public static void main(String[] args)
    {

        int number;           // variable
        int results = (0);    // Variable

        Scanner scanner = new Scanner(System.in);  // Scanner
        System.out.println(" Please Enter Number :  ");
        number = scanner.nextInt();    // to store the integer value in to int variable

        for(int i =1; i<=number; i++)
        {
            results = results+i;

        }

        System.out.println(" Sum of Entered Natural Number is : " + results);
    }
}
