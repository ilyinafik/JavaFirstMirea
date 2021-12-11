package ru.mirea.task26.exercise1;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();

}