/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class Marathon {

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        int counter = 0;
        while (n>0) {
            int a, b, c, d;
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            d = s.nextInt();
            if (b>a) {
                counter++;
            }
            if (c >a) {
                counter++;
            }
            if (d > a) {
                counter++;
            }
            n--;
            System.out.println(counter);
            counter =0;
        }

    }
}
