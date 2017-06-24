/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chek Wei
 */
public class Calculate {
    public static void main(String[] args){
        int num1 = 20;
        int num2 = 30;
        int num3 = 50;
        
        int sum = Formula.Total(num1, num2, num3);
        int times = Formula.Product(num1, num2, num3);
        
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + times);
    }
}
