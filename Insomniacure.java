/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class Insomniacure {

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int k = s.nextInt();
        int l = s.nextInt();
        int m = s.nextInt();
        int n = s.nextInt();
        int d = s.nextInt();
        int count = 0;
        for (int i = 1; i <= d; i++) {
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) 
                count++;
            
        }
        System.out.println(count);
    }
}
