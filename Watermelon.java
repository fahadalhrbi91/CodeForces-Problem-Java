/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class Watermelon {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int b = s.nextInt();
        if (b%2==0 && b >2 ) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
