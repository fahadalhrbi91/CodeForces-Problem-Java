/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class WordCapitalization {

    public static void main(String[] args)throws Exception{
        java.util.Scanner s = new java.util.Scanner(System.in);
        String n = s.next();
        char d = n.charAt(0);

        if (Character.isUpperCase(d)) {
            System.out.println(n);
        } else {
            String x = n.substring(0, 1).toUpperCase();
            System.out.println(x.concat(n.substring(1)));

        }
    }
}