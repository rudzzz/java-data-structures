package StaticArray;

import java.util.Scanner;

public class Excercise01 {
    public static void main(String[] args){

     /*
        Write a program to initialize a static array with
        a set of numbers and print the sum of all the numbers
        in the array.
     */

        int[] cars = new int[3];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < cars.length; i++){
            System.out.println("What number you wat to add? ");
            int number = scanner.nextInt();
            cars[i] = (number);
            sum += number;
        }
        scanner.close();
        System.out.println("Sum of all the numbers:  " + sum);
    }
}
