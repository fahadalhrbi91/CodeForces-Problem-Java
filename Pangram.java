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

public class Pangram {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        z.nextInt();
        String x = z.next();
        int k = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (x.toLowerCase().contains(String.valueOf(ch))) {
                k++;
            }
        }
        if (k == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
