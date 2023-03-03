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
            sum = sum + (temp * temp *temp); // can be written as in mathematical form -> (n*n*n*n*...)
            number = number/10;
        }
        return sum; //should return to "sum" for comparing result
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); // scanner
        int size;
        int result = 0; // stores "sum" value which comes from calculate_armstrong

        System.out.println("How many numbers do you want to enter?");
        size = read.nextInt();
        for(int i = 0; i < size; i++){
            System.out.println("Enter " + (i + 1) + ". three digit element > ");
            int number = read.nextInt(); // takes inputs
            result = calculate_armstrong(number); // "result" stores "sum" which comes as a return value of function
            if (result == number){
                System.out.println(number + " => YES");
            }
            else {
                System.out.println(number + " => NO");
            }
        }
    }
}
