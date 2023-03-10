package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    void calculateBonus() {
        assertEquals(500, service.remain(2500));
    }

    @Test
    void calculateBonusWhenMinBoundary() {
        assertEquals(1000, service.remain(0));
    }

    @Test
    void calculateBonusWhenHighMinBoundary() {

        assertEquals(999, service.remain(1));
    }

    @Test
    void calculateBonusWhenLowHighBoundary() {
        assertEquals(1, service.remain(999));
    }

    @Test
    void calculateBonusWhenHighBoundary() {
        assertEquals(0, service.remain(1000));
    }
}