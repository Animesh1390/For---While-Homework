import java.util.Scanner;

public class PrintNumber_Range_01
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);           // scanner method import
        System.out.print("Enter the value of a \t  :");
        int a = scanner.nextInt();                          // for to print the above line.

        System.out.print(" Enter the value of b \t :");
        int b = scanner.nextInt();


        for (int i=a; i<=b; i++)                            // for loop method
        {

            System.out.println(i);                          // to print the main out put


        }
    }
}
