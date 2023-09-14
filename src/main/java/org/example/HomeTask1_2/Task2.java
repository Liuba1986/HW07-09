package org.example.HomeTask1_2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {


      ShopsTask2 shops = new ShopsTask2();

        Scanner scanner = new Scanner(System.in);

        System.out.println("магазин Rewe открыт? - ");
       shops.isReweOpen = scanner.nextBoolean();


        System.out.println("магазин Edeka открыт? - ");
        shops.isEdekaOpen = scanner.nextBoolean();

        boolean isPossibleBuyFood = shops.canBuy();

        if (isPossibleBuyFood) {
            System.out.println("Магазин открыт и можно купить продукты");
        } else {
            System.out.println("Оба магазина закрыты!!! Выходной!");
        }

    }
}

