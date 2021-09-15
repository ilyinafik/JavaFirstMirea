package ru.mirea.task1.opt1;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        int Sum = 0;
        Scanner s = new Scanner(System.in);
        int[]a = new int[5];
        System.out.println("Введите числа массива: ");
        for(int i = 0; i<5; i++) {
            a[i]=s.nextInt();
            Sum = Sum + a[i];
        }
        System.out.println("Сумма чисел массива равна: " + Sum);
    }
}
