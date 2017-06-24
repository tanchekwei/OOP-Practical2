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
import java.lang.Math;
public class p2q3 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "Number", "SquareRoot");
        for(double i = 0; i <= 20; i+=2){
            System.out.printf("%-10.0f%-10.4f\n", i, Math.sqrt(i));
        }
    }
}
