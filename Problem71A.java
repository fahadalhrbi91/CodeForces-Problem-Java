/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */

public class Problem71A {

    public static void main(String args[]) {
        java.util.Scanner sr = new java.util.Scanner(System.in);

        int length = sr.nextInt();
        String input = "";

        for (int i = 0; i <= length; i++) {
            input = sr.nextLine();

            if (input.length() > 10) {
                System.out.print(input.charAt(0));
                System.out.print(input.length() - 2);
                System.out.println(input.charAt(input.length() - 1));
            } else {
                System.out.println(input);
            }

        }
    }

}
