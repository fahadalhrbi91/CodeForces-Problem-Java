/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
import java.util.Scanner;

public class Dominopiling {
    public static void main(String[] args) {
        Scanner n  = new Scanner (System.in);
        int d = n.nextInt();
        int b = n.nextInt();
        int k = (d * b)/2;
        System.out.println(k);
    }
}
