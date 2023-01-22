/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class DivisibilityProblem {

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int number = s.nextInt();
        int counter = 0;
        while (number>0) {
            int a = s.nextInt();
            int b= s.nextInt();
            if (a%b==0) {
                System.out.println("0");
            }
            else
            {
                System.out.println(b-(a%b));
            }
            number--;
        }
        
    }
}
