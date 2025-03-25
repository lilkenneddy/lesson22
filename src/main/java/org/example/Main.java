package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(20, 7.5, LocalDate.of(2025, 5, 10));
        System.out.println("Машина може їхати? " + car.canDrive());
        System.out.println("Машина допущена до експлуатації? " + car.isAllowedToDrive());
        System.out.println("Максимальна дистанція: " + car.maxDistance() + "КМ");
    }


}