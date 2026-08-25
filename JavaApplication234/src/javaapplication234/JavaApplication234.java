/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication234;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication234 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

             Scanner scanner = new Scanner (System.in);
             System.out.println("enter the 1st number: ");
             int num1 = scanner.nextInt();
             System.out.println("enter the 2nd number: ");
             int num2 = scanner.nextInt();
             System.out.println("enter the 3rd number: ");
             int num3 = scanner.nextInt();
             
             int greatest = num1;
             if (num2 > greatest){
                 greatest = num2;
             }
             if (num3 > greatest){
                 greatest = num3;
             }
             System.out.println("the greatest number is: " + greatest);
             scanner.close();
         }
    }
    

