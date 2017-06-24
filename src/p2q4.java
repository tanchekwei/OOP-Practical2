/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tan Chek Wei
 * @ID 1602116
 * @DCO2 DD4
 *
 */
//import java.util.Scanner;
import java.lang.Math;

public class p2q4 {

    public static void main(String[] args) {
        for(double x = 0; x < 20.5; x+=0.5){
            System.out.println("x = " + x + " root = " + squareRoot(x));
        }

    }
    
    public static double squareRoot(double x){
        double lowerLimit, upperLimit;
        double midpoint, midpointSquare;
        
        if(x < 0){
            System.out.print("Error: square root of negetive number\n");
            System.exit(1);
        }
        if(x == 0){
            return 0;
        }
        if(x < 1.0){
            lowerLimit = x;
            upperLimit = 1.0;
        }
        else if(x > 1.0){
            lowerLimit = 1.0;
            upperLimit = x;
        }
        else{
            return 1.0;
        }
        
        while(Math.abs((lowerLimit - upperLimit) / 1) >= 1.0e-8){
            midpoint = (lowerLimit + upperLimit) / 2.0;
            midpointSquare = midpoint * midpoint;
            if(midpointSquare > x){
                upperLimit = midpoint;
            }
            else{
                lowerLimit = midpoint;
            }
        }
        return (lowerLimit + upperLimit) / 2.0;
    }
}


/*
        //Implement the sqrt method using the approximation approach
        //initialized lowerLimit and upperLimit solve an error.
        double lowerLimit = 0, upperLimit = 0;

        //num is the number to square root.
        for (double num = 0; num <= 20; num++) {

            if (num >= 1) {
                lowerLimit = 1; //lower limit to one
                upperLimit = num; //upper limit to the number
            }
            //else statement is excluded first for sake of simplicity.

            double squareMidpoint;
            double midpoint;

            do {
                //Determine the midpoint between the lower and upper limits
                midpoint = (lowerLimit + upperLimit) / 2;

                //Evaluate the square of the midpoint
                squareMidpoint = Math.pow(midpoint, 2);

                //If the square of the midpoint is greater than the number
                if (squareMidpoint > num) {
                    //upper limit to the midpoint
                    upperLimit = midpoint;
                } else {
                    //lower limit to the midpoint
                    lowerLimit = midpoint;
                }

                //even though upperLimit/lowerLimit == 1 still keep looping
            } while (upperLimit - lowerLimit > 0.000000001);

            //Output
            System.out.printf("x = %.0f, root = %.16f\n", num, midpoint);
        } // 1/108-8
*/