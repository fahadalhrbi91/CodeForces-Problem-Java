/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class InSearchofanEasyProblem {

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int number = s.nextInt();
        int res = 0;
        while (number > 0) {
            int a = s.nextInt();
            if (a == 1) {
                res++;
            }
            number--;
        }

        if (res > 0) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }

    }
}
