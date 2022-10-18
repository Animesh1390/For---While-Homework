import java.util.Scanner;

public class PrimeNumber_03
{
  static int number;
   static int count=0;



    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter any Number Please :");
        int number = scanner.nextInt();

        for(int i=1;i<=number; i++)  // using For loop method
        {
            if (number%i==0)
            {
                count++;
            }
        }
        if (count == 2)      // count is added as new variable
        {
            System.out.println("Entered Number is Prime Number ");
        }
        else
        {
            System.out.println("Entered Number is Not a Prime Number ");
        }


    }
}
