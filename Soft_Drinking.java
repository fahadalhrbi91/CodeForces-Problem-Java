/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class Soft_Drinking {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n, k, l, c, d, p, nl, np;
        n=s.nextInt();
        k=s.nextInt();
        l=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        p=s.nextInt();
        nl=s.nextInt();
        np=s.nextInt();
       int b = k*l;
       int bb=b/n;
       int b3 = c*d;
       int b4 = p/np;
        System.out.println(Math.min(Math.min(bb, b3), b4)/n);
        
    }
}
