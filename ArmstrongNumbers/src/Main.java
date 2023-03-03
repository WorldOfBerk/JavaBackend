/*******************************************************************************
 * Armstrong number definition is the number in any given number base,
 * which forms the total of the same number, when each of its digits is
 * raised to the power of the number of digits in the number.
 * ****************************************************************************/

/*****************************************************************************
 * This program can calculate three-digits Armstrong numbers.
 * ***************************************************************************/
import java.util.Scanner;

public class Main {
    public static int calculate_armstrong(int number){
        int temp;
        int sum = 0;

        while(number > 0){
            temp = number%10;
            sum = sum + (temp * temp *temp); //
            number = number/10;
        }
        return sum; //should return to sum for comparing result
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size;
        int result = 0;

        System.out.println("How many numbers do you want to enter?");
        size = read.nextInt();
        for(int i = 0; i < size; i++){
            System.out.println("Enter " + (i + 1) + ". three digit element > ");
            int number = read.nextInt();
            result = calculate_armstrong(number);
            if (result == number){
                System.out.println(number + " => YES");
            }
            else {
                System.out.println(number + " => NO");
            }
        }
    }
}
