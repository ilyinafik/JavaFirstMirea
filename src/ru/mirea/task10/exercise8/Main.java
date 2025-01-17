package ru.mirea.task10.exercise8;

public class Main {

    private static boolean isPalindrome(String line, int index) {
        return index >= line.length() / 2
                || line.charAt(index) == line.charAt(line.length() - index - 1)
                && isPalindrome(line, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam", 0) ? "YES" : "NO");
    }

}

