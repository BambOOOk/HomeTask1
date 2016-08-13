package com.company.Task5;
import  java.util.Scanner;

/**
 * Created by ihor on 12.08.16.
 */
public class Task5 {
    public static void main(String[] args) {
        // write your code here
        Scanner arg1 = new Scanner(System.in);
        System.out.println("ВВедите первое число: ");
        double a1 = arg1.nextDouble();
        System.out.println("Первое число " + a1);

        Scanner arg2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        double a2 = arg2.nextDouble();
        System.out.println("Второе число " + a2);

        double m = 10 - a1;
        double b = 10 - a2;

        if (10-a1 < 10 - a2) {
            System.out.println("Ближе к 10 из двух чисел " + a1);

        }   else if (10- a1<0 && 10-a2 < 0){
            m=-1*m;
            b=-1*b;
            if (m <b){
                System.out.println("Ближе к 10 из двух чисел " + a1);

            }else   System.out.println("Ближе к 10 из двух чисел " + a2);



        }
        else if (10 -a1  > 10 - a2  && 10- a2 >0)  {
            System.out.println("Ближе к 10 из двух чисел " + a2);


        }
        else {
            System.out.println("Ближе к 10 из двух чисел " + a1);

        }
    }
}
