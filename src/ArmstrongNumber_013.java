import java.util.Scanner;

public class ArmstrongNumber_013 {


    public static void main(String[] args) {

        int number;
        int remainder; // local variable represent remainder
        int result = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Entered Any Three Number Please ");
        number = scanner.nextInt();
        int z = number; // to store the vaule of number


        while (number > 0) ;
        {
            remainder = number % 10; // remainder is the variable to store the value of number%10
            result = (remainder * remainder * remainder) + result;
            number = number / 10;

        }
        if (z == result)
        System.out.println(" Entered Number is + Armstrong Number ");

        else

        System.out.println(" Entered Number is + Not Armstrong Number");


    }
}

