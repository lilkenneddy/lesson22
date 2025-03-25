package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void schoulDoDrive() {
        // given
        Car car = new Car();

        // when
        boolean canDrive = car.canDrive();

        // then
        assertEquals("canDrive");
    }

    private void assertEquals(String canDrive) {
    }

}
