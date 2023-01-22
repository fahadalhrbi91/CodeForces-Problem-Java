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
public class Bit 
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int x=0;
        String a = "++X";
        String b = "X++";
        String[] str = new String[num];
        for(int i=0;i<num;i++)
        {
            String y = ip.next();
            str[i]=y;
        }
        for(int i=0;i<num;i++)
        {
            if(str[i].equals(a) || str[i].equals(b))
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}