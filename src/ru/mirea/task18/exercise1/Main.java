package ru.mirea.task18.exercise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 0123456789 - валидный
        // 1sadfdsfsddsfsd - невалидный
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: ФИО ИНН");
        String[] values = scanner.nextLine().split(" ");
        if (values.length == 4) {
            try {
                Validator<String> validator = new ItnValidator();
                validator.validate(values[3]);
                System.out.println("ИНН корректен.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}