package ru.netology;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerTest {
    CashbackHacker cashbackHacker = new CashbackHacker();

    @Test
    public void shouldRemain1000() {
        int expected = 0;
        int actual = cashbackHacker.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain2000() {
        int expected = 1;
        int actual = cashbackHacker.remain(1999);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain900() {
        int expected = 100;
        int actual = cashbackHacker.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain1100() {
        int expected = 900;
        int actual = cashbackHacker.remain(1100);
        assertEquals(expected, actual);
    }
}