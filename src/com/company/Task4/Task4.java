package com.company.Task4;
import java.util.Scanner;

/**
 * Created by ihor on 12.08.16.
 */
public class Task4 {
    public static void main(String[] args) {
        // write your code here
        Scanner x = new Scanner(System.in);
        System.out.println("Введите число ");


        int a = x.nextInt();


        int b=a%10;
        double c=(a/10)%10;
        System.out.println("Сумма цифр числа " +a +" равна "+(b+c));

    }
}
