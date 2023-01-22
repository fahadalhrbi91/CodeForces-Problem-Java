/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;


public class Drinks {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int number = s.nextInt();
        int []arr = new int [number];
        double sum=0;
        for (int i = 0; i <number; i++) {
            arr[i]= s.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum/number);
        
    }
}
