package org.example;

import lombok.*; // добавив lombok
import java.time.LocalDate;

    //lombok застосовано
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Data

//створив конструктор
    public class Car {
        public short canDrive;
        private double fuelLevel;               // Поточний рівень пального (л)
        private final double tankCapacity = 60; // Ємність бака (л)
        private double fuelConsumptionPer100km; // Витрата палива (л на 100 км)
        private LocalDate nextTuev;             // Дата останнього техогляду

        public Car(int i, double v, LocalDate of) {
        }

        // 1. Чи може їхати (бак не порожній)
        public boolean canDrive() {
            return fuelLevel > 0;
        }

        // 2. Чи допущена до експлуатації (техогляд актуальний)
        public boolean isAllowedToDrive() {
            return nextTuev.isAfter(LocalDate.now()) || nextTuev.isEqual(LocalDate.now());
        }

        // 3. Скільки може проїхати (виходячи з рівня пального)
        public double maxDistance() {
            return (fuelLevel / fuelConsumptionPer100km) * 100;
        }

    }

