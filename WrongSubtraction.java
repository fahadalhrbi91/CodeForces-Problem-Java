/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class WrongSubtraction {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        int n2= s.nextInt();
        int sum = 0;
        for (int i = n; i >n2; i--) {
           sum = n-n2;
        }
        System.out.println(sum);
    }
}
