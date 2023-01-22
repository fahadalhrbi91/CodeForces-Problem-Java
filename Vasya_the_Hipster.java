/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class Vasya_the_Hipster {

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int a =s.nextInt(); int b =s.nextInt();
        
        if (a>b) {
            System.out.print(b+" ");
            
        }
        else{
            System.out.print(a+" ");
        }
        int ans = Math.abs(a-b);
        System.out.println(ans/2);
     
    }

}
