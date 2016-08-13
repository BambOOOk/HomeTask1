package com.company.Task7;
import java.util.Scanner;

/**
 * Created by ihor on 12.08.16.
 */
public class Task7 {
    public static void main(String[] args) {
        // write your code here
        Scanner arg1 = new Scanner(System.in);
        System.out.println("Введите коэф а =");
        double a = arg1.nextDouble();

        Scanner arg2 = new Scanner(System.in);
        System.out.println("Введите коэф b =");
        double b = arg2.nextDouble();

        Scanner arg3 = new Scanner(System.in);
        System.out.println("Введите коэф c =");
        double c = arg3.nextDouble();

        System.out.println("Квадратное уравнение = "+a+"x^2+"+b+"x+"+c+"=0");

        double d = b * b - 4 * a * c;
        System.out.println("Дискриминант d = ");

        if (d < 0) {
            System.out.println("Решения нет");
        } else if (d == 0) {

            double x1 = ((-b) / (2 * a));

            System.out.println("X1 = X2 = " + x1);
        } else {
            if (d > 0) {

                double x1 = ((-b + Math.sqrt(d)) / (2 * a));
                double x2 = ((-b - Math.sqrt(d)) / (2 * a));

                System.out.println("Решение уравнения: " + "первый корень = " + x1 + "; второй корень = " + x2 + ";");


            }
        }
    }
}
