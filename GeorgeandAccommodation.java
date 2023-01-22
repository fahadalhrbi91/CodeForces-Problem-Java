/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class GeorgeandAccommodation {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int number = s.nextInt();
        int count = 0 ;
        while (number > 0) {
            int a = s.nextInt(); int b = s.nextInt();
            if ((b-a)>=2) {
                count++;
            }
            number--;
        }
        System.out.println(count);
    }
}
