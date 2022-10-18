import java.util.Scanner;

public class SumFirstLast_14
{

    public static void main(String[] args) {

        // Variable declared
         int number;
        int last;
        int first;
        int sum;

        Scanner scanner =new Scanner(System.in);                //scanner object
        System.out.print("Enter any Five Digit Number : ");
        number= scanner.nextInt();

         last = number%10;  // to remove last digit

         while(number>9)
        {
            number=number/10; //

        }
        sum = last + number;

        System.out.println(" Sum of First and Last Digit of Number is  : " +  sum);


    }
}
