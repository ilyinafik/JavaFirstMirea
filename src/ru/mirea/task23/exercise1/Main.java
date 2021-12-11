package ru.mirea.task23.exercise1;

public class Main {

    public static void main(String[] args) {
        ObjectExample[] objectExamples = {
                new ObjectExample(1),
                new ObjectExample(2),
                new ObjectExample(3),
                new ObjectExample(2),
                new ObjectExample(1)
        };

        System.out.println("+ objects hashcode are equal");
        System.out.println("- objects hashcode are not equal");
        System.out.print(" ");
        for (int i = 0; i < objectExamples.length; i++) {
            System.out.print(" " + i);
        }
        System.out.println(" ");
        for (int i = 0; i < objectExamples.length; i++) {
            System.out.print(i);
            for (int j = 0; j < objectExamples.length; j++) {
                boolean isHashcodeEqual = objectExamples[i].hashCode() == objectExamples[j].hashCode();
                System.out.print(" " + (isHashcodeEqual? "+" : "-"));
            }
            System.out.println();
        }
    }

}
