/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chek Wei
 */
public class p2q2 {
    public static void main(String[] args){
        int a = 10, b = 20, c = 30;
        double num1  = 10, num2 = 20, num3 = 30;
        
        System.out.printf("Average.calculateAverage(" + a + ", " + b + ") = %d\n", Average.calculateAverage(a, b));
        System.out.printf("Average.calculateAverage(a, b, c) = %d\n", Average.calculateAverage(a, b, c));
        System.out.printf("Average.calculateAverage(num1, num2) = %.2f\n", Average.calculateAverage(num1, num2));
        System.out.printf("Average.calculateAverage(num1, num2, num3) = %.2f\n", Average.calculateAverage(num1, num2, num3));
    }
}
