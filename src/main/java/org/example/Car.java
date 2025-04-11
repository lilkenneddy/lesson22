package org.example;

import java.time.LocalDate;

public class Car {
    private double fuel;
    private double fuelPer100Km;
    private LocalDate nextTuev;

    public Car(double fuel, double fuelPer100Km, LocalDate nextTuev) {
        this.fuel = fuel;
        this.fuelPer100Km = fuelPer100Km;
        this.nextTuev = nextTuev;
    }

    // Конструктор без параметрів — для тестів або коли не хочеш одразу задавати значення
    public Car() {
        this.fuel = 0;
        this.fuelPer100Km = 0;
        this.nextTuev = LocalDate.now().plusYears(1);
    }

    public boolean canDrive() {
        return fuel > 0;
    }

    public boolean isAllowedToDrive() {
        return nextTuev != null && nextTuev.isAfter(LocalDate.now());
    }

    public double maxDistance() {
        if (fuelPer100Km == 0) return 0;
        return (fuel / fuelPer100Km) * 100;
    }
}
