/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2016_1;

/**
 *
 * @author Goh
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] num  ={34,15,12,27,74,23};
        int cnt = 0;
        for(int i =0;i<num.length;i++){
            if(isEven(num[i])){
                cnt++;
            }
        }
        System.out.println("The number of even number is " + cnt);
        System.out.println("The sum of the array is " + getTotal(num));
    }
    
    public static boolean isEven(int num){
        if(num%2==0)
            return true;
        else
            return false;
    }
    
    public static int getTotal(int[] a){
        int total = 0;
        for(int i=0;i<a.length;i++){
            total += a[i];
        }
        return total;
    }
}
