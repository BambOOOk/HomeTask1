package com.company.Task6;
import java.util.Scanner;
/**
 * Created by ihor on 12.08.16.
 */
public class Task6 {
    public static void main(String[] args) {
        // write your code here

        Scanner cat1 = new Scanner(System.in);
        System.out.println("Введите катет а =");
        int a = cat1.nextInt();

        Scanner cat2 = new Scanner(System.in);
        System.out.println("Введите катет b =");
        int b = cat2.nextInt();

        double s = 0.5*a*b;
        System.out.println("Площадь треугольника S ="+s);

    }

}
