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
 */
public class p2q1 {
    public static void main(String[] args) {
        
        System.out.printf("%-10s%-15s%-10s%-15s\n", "Inches", "Centimeters", "Inches", "Centimeters");
        for(double i = 1, j = 5; i <= 10; i++, j+=5){
            double cm = inchToCentimeter(i);
            double in = centimeterToInch(j);
            System.out.printf("%-10.1f%-15.2f%-10.1f%-15.2f\n", i, cm, j, in);
        }
    }
    
    /** Converts from inches to centimeters */
    public static double inchToCentimeter(double in){
        double cm = in * 2.54;
        return cm;
    }
    
    /** Converts from centimeters to inches */
    public static double centimeterToInch(double cm){
        double in = cm / 2.54;
        return in;
    }

}
