

import java.util.Scanner;


/**
 *
 * @author Sayed Mohammad Reza Dawodi
 */

public class Third {
    
    public static void main(String[] args){
        
        /*First of all we need to ask the user to enter three numbers! */
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double firstnum = input.nextDouble();
        System.out.print("Input the second number: ");
        double secondnum = input.nextDouble();
        System.out.print("Input the third number: ");
        double thirdnum = input.nextDouble();
        
        /*Printing the smallest value among three numbers!*/
        System.out.print("The samllest Value is " +
                thesmallestvalue(firstnum, secondnum, thirdnum) + "\n");
    
    }
    
        
    public static double thesmallestvalue(double firstnum, double secondnum, double thirdnum){
       return Math.min(Math.min(firstnum,secondnum),thirdnum);
   
   }
}

