import java.util.Scanner;

public class MultiplicationTable
{




    public static void main(String[] args) {

        int number; // Local Variable

        Scanner scanner =new Scanner(System.in);           // scanner object
        System.out.print(" Please Enter Any Number : ");
         number = scanner.nextInt();   // to store the integer value in to int variable


        for (int i=1; i<=10;i++)

        {
            System.out.println( number + "*" +i+  "=" + number*i );
        }


    }
}
