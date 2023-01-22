/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class Word {

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        String input = s.nextLine();
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                counter++;

            }
        }
       
         if (input.length()>counter) {
            System.out.println(input.toLowerCase());
        }
        else{
            System.out.println(input.toUpperCase());
        }

    }

}
