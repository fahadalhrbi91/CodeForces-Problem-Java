/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class RestoringThreeNumbers {

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int x = s.nextInt();
        int x2 = s.nextInt();
        int x3 = s.nextInt();
        int x4 = s.nextInt();
        int arr[] = new int[4];
        arr[0] = x;
        arr[1] = x2;
        arr[2] = x3;
        arr[3] = x4;
        int a = arr[2] - arr[0];
        int b = arr[2] - arr[1];
        int c = arr[3] - arr[0];
        System.out.println(java.util.Arrays.toString(arr));
        System.out.print(a+" "+ b + " "+ c);
        System.out.println("");

    }

}
