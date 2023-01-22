/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Fahd1
 */
public class HelpfulMaths {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        String n = s.next();
       StringBuilder b = new StringBuilder();
      char x[] = n.replace("+", "").toCharArray();
      java.util.Arrays.sort(x);
        for(char a : x){
            b.append(a).append("+");
        }
        System.out.println(b.substring(0,b.length()-1));
        
       
    }
    
}
