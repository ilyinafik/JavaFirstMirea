package ru.mirea.task1.opt1;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        int Sum = 0;
        Scanner s = new Scanner(System.in);
        int[]a = new int[5];
        System.out.println("Введите числа массива: ");
        int i = 0;
        while(i < 5) {
            a[i]=s.nextInt();
            Sum = Sum + a[i];
            i++;
        }
        System.out.println("Сумма чисел массива равна: " + Sum);
    }
}