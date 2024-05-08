package com.pluralsight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelOperationsTest {


    @Test
    public void testIsOccupiedShouldEqualFalse() {
        Room test1 = new Room(13, 129.00);
        Room test2 = new Room(1, 145.00);
        test1.isOccupied();
    }


}