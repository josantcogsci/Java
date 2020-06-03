/**
 * ' PrintSquare '
 * Written by José Antonio Mendoza Chávez
 * Wednesday, June 3rd, 2020.
 * E-mail: ja.mendozachavez@gmail.com
 * Twitter: @josantcogsci
 * Github: https://github.com/josantcogsci
 * LinkedIn: https://www.linkedin.com/in/josantcogsci
 */

/** 
 * A program that reads an integer that ys typed in by the
 * user and cimputes and prints the square of that integer.
 */

import textio.TextIO;

public class PrintSquare {

    public static void main(String[] args) {

        int userInput; // The number input by the user.
        int square; // The userInput, multiplied by itself.

        System.out.print("Please type a number: ");
        userInput = TextIO.getlnInt();
        square = userInput * userInput;

        System.out.println();
        System.out.println("The number that you entered was " + userInput);
        System.out.println("The square of that number is " + square);
        System.out.println();

    } // end of main()

} // end of class PrintSquare