package math.problems;

import java.util.Scanner;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number;");
        int n = in.nextlnt();
        Systen.out.println("Factorial ="+ new Factorial().factorial(n));

    }
}
