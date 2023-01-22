/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Fahd1
 */
import java.util.*;

public class AntonandDanik {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        String howone = s.next();
        char d[] = howone.toCharArray();
        int countA = 0;
        int countD = 0;
        for (char c : d) {
            if (c == 'A') {
                countA++;
            }
            else{
                countD++;
            }
        }
        if (countA> countD) {
            System.out.println("Anton");
        }
        else if(countA < countD){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }

    }
}
