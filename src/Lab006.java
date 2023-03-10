/**
 * @author MK Ripley
 *
 * @since Version 1.0
 * 3/09/2023
 */

import java.util.Scanner;
public class Lab006 {
    static int n;
    static int m;

    /**
     *
     * @param x is the numerator value
     * @param y is the denominator value
     */
    public Lab006(int x, int y){
        n = x;
        m = y;
    }

    /**
     * computes the division of x by y and evaluates false if there is a remainder
     * @return
     */
    public static boolean isDivisible () {
        return n % m == 0;
    }

    /**
     * asks for the numerator and then the denominator value from the user,
     * displays proper result about remainder depending on if value returns true or false
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter numerator:");
        int numerator = Integer.parseInt(input.nextLine());
        System.out.println("enter denominator: ");
        int denominator = Integer.parseInt(input.nextLine());

        Lab006 one = new Lab006(numerator, denominator);

        if (one.isDivisible()){
            System.out.printf("dividing %d by %d will have no remainder", numerator, denominator);
        }
        else{
            System.out.printf("dividing %d by %d will have a remainder", numerator, denominator);
        }
    }
}