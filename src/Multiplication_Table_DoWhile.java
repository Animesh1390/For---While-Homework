import java.util.Scanner;

public class Multiplication_Table_DoWhile
{


    public static void main(String[] args) // Main method Declared to run the program
    {


        System.out.println();  // just for better space in console

        Scanner scanner = new Scanner(System.in); // Scanner Object

        System.out.println(" Please Enter fist digit  :");
       int a=scanner.nextInt();                                // to input user data

       System.out.println("Please Enter Second Digit  :");
       int b= scanner.nextInt();

       System.out.println("Please Enter Third Digit  :");
       int c= scanner.nextInt();
       int i =1;

        do
        {
            System.out.println(a * i + " " + b * i + " "  + c * i );  //   multiplication

            i++;

        }
        while (i<=7);




    }
}
