package ru.netology;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackerTest {
    CashbackHacker cashbackHacker = new CashbackHacker();

    @Test
    public void shouldRemain1000() {
        int expected = 0;
        int actual = cashbackHacker.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain2000() {
        int expected = 10;
        int actual = cashbackHacker.remain(2000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain900() {
        int expected = 0;
        int actual = cashbackHacker.remain(900);
        assertEquals(actual, expected, "to receive bonuses, increase the purchase amount to 1100 rubles.");
    }

    @Test
    public void shouldRemain1100() {
        int expected = 1;
        int actual = cashbackHacker.remain(1100);
        assertEquals(actual, expected);
    }
}