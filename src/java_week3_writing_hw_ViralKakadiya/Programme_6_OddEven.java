package java_week3_writing_hw_ViralKakadiya;

import java.util.Scanner;

/*
*Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6_OddEven {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number You want to check: ");
        int number = scanner.nextInt();
        Programme_6_OddEven oddEven = new Programme_6_OddEven();
        System.out.println(number + " is " +oddEven.isItEvenOrOddNumber(number) + "number");
       //Closing the scanner object
        scanner.close();
    }

    //checking the odd or even
    public String isItEvenOrOddNumber(int number){
        if(number % 2 == 0){
            return "Even";
        } else {
            return "odd";
        }
    }
}
