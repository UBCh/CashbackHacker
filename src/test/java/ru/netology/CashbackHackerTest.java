package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerTest {
    CashbackHacker cashbackHacker = new CashbackHacker();

    @Test
    void shouldRemain1000() {
        int expected = 1000;
        int actual = cashbackHacker.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemain2000() {
        int expected = 1;
        int actual = cashbackHacker.remain(1999);
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemain900() {
        int expected = 100;
        int actual = cashbackHacker.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemain1100() {
        int expected = 900;
        int actual = cashbackHacker.remain(1100);
        assertEquals(expected, actual);
    }
}