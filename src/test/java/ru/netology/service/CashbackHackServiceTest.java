package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void calculateBonus() {
        assertEquals(service.remain(2500), 500);
    }
    @Test
    void calculateBonusWhenMinBoundary() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    void calculateBonusWhenHighMinBoundary() {
        assertEquals(service.remain(1), 999);
    }

    @Test
    void calculateBonusWhenLowHighBoundary() {
        assertEquals(service.remain(999), 1);
    }
    @Test
    void calculateBonusWhenHighBoundary() {
        assertEquals(service.remain(1000), 0);
    }
}