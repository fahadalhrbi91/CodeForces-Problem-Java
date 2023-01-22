/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;



/**
 *
 * @author Fahd1
 */
public class AddOddorSubtractEven {
      public static void main(String[] args) throws Exception {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t>0){
            int a=sc.nextInt(),b=sc.nextInt();
            if (a==b) sb.append(0+"\n");
            else if (a-b<0){
                if ((b-a)%2==1){
                    sb.append(1+"\n");
                }else sb.append(2+"\n");
            }else {
                if ((a-b)%2==0){
                    sb.append(1+"\n");
                }else sb.append(2+"\n");
            }
            t--;
        }
        System.out.println(sb);
    }
}
