package ru.mirea.task5.Dish;

public class DishTest {

    public static void main(String[] args) {
        Dish[] dishes = {new DessertPlate(), new DinnerPlate(), new SaladBowl()};

        for (Dish dish : dishes) {
            System.out.println(dish);
        }
    }

}