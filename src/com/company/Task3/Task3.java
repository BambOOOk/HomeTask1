package com.company.Task3;
import java.util.Scanner;

/**
 * Created by ihor on 12.08.16.
 */
 public class Task3 {
    public static void main(String[] args) {
        // write your code here
        Scanner k = new Scanner(System.in);
        System.out.println("Введите число");
        double x = k.nextDouble();
        if (x%2==0){
            System.out.println("Чётное число "+x);
        }
        else {
            System.out.println("Введите чётное число");
        }

    }
}
