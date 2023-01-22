/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBetheGuy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        Set<Integer> distinctElements = new LinkedHashSet<>();
        while (p-- >= 1) {
            distinctElements.add(sc.nextInt());
        }
        int q = sc.nextInt();
        while (q-- >= 1) {
            distinctElements.add(sc.nextInt());
        }
        if (distinctElements.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

    }
}
