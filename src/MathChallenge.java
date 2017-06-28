/**
 * Created by TACasey-Calhoun on 6/27/2017.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathChallenge {
        public static void main(String[] args) {
            int digit;
            int reqNum = 0;

/*Input: While loop prompts user to input 3 digit number from 100 to 999,
'try' sends the message for user input and then evaluates if it is valid,
'catch' to eliminate program error (InputMismatchException) and prompt the user to input a valid integer.
*/
            Scanner scanner = new Scanner(System.in);
            while (reqNum < 100 || reqNum > 999) {
                try {
                    System.out.print("Enter your 3 digit positive integer here:  ");
                    reqNum = scanner.nextInt();
                } catch (InputMismatchException ex) {
                    scanner.next();
                }
            }

//TASK: Calculations for the input integer number
            int num = reqNum;
            int tempVar = 0;


            //While loop to execute as long as num is not zero.
            while (num != 0) {

                //Modulus (%) operator to extract each and every digit from last to first.
                digit = num % 10;

                //Raise the remainder from the modulus method to cube 'digit' using the Math.pow function,
                // put into an integer and then add it to the existing sum (tempVar).
                tempVar = (int) (tempVar + Math.pow(digit, 3));

                //After calculating ‘digit’ and adding it to ‘tempVar’, we divide the‘num‘ by 10.
                //It will remove the last digit from the number. We continue these steps until ‘num‘ becomes 0.
                num = num / 10;

                //Calculation break down printed out for user to view.
                System.out.println(digit + " " + num + " " + tempVar);
            }

//OUTPUT: Result print out based on caluclations
            if (reqNum == tempVar)
                System.out.println("True!  This IS an Armstrong number.");
            else
                System.out.println("False!  This is NOT an Armstrong number.");

        }
    }
