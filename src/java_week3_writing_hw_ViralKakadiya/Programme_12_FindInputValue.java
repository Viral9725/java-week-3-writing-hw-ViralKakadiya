package java_week3_writing_hw_ViralKakadiya;

import java.util.Scanner;

/*
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_FindInputValue
{
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Character");
        char ch = scanner.next().charAt(0);
        //Object creation
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing the Scanner object
        scanner.close();
    }

    //Find the input value is Alphabet,Digit and Symbol
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch){
        if ((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch+ " is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch+ "is a digit.");
        } else {
            System.out.println(ch + " is a symbol.");
        }
    }
}
