package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void calculateBonus() {
        assertEquals(service.remain(2500), 500);
    }

    @Test
    public void calculateBonusWhenMinBoundary() {
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void calculateBonusWhenHighMinBoundary() {

        assertEquals(999, service.remain(1));
    }

    @Test
    public void calculateBonusWhenLowHighBoundary() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void calculateBonusWhenHighBoundary() {
        assertEquals(0, service.remain(1000));
    }
}