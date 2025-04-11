package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void shouldDrive() {
        //given
        Car car = new Car();
        //when
        boolean canDrive = car.canDrive();
        //then
        assertEquals(false, canDrive);
    }

    @Test
    public void ShouldIsAllowedToDrive() {
        //given
        Car car = new Car();
        //when
        boolean IsAllowedToDrive = car.isAllowedToDrive();
        //then
        assertEquals(true, IsAllowedToDrive);
    }


    @Test
    public void shouldDoMaxDistance() {
        //given
        Car car = new Car();
        //when
        double maxDistance = car.maxDistance();
        // then
        assertEquals(0.0, maxDistance, 0.001);
    }
}