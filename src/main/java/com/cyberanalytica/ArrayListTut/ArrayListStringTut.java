package com.cyberanalytica.ArrayListTut;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStringTut {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");

        System.out.println(cars);

        cars.add(0, "Maserati");

        System.out.println(cars);

        String secondCar = cars.get(2);
        System.out.println(secondCar);

        cars.set(1, "suzuki");
        System.out.println(cars);

        System.out.println(cars.size());

        cars.add("Urus");

        System.out.println(cars);

        cars.add("Axela");
        System.out.println(cars);

        Collections.sort(cars);
        System.out.println(cars);

        for (String car : cars) {
            System.out.println("look at this ... ");
            System.out.println(car);
        }


        cars.clear();
        System.out.println(cars);
    }
}
