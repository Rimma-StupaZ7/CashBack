package ru.netology.CashBack;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldSeeAdditionalAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int expected = 300;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void AmountWhenSpentAThousand() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void WenSpendMin() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void ShowAmountWhenFullThousand() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;
        assertEquals(expected, actual);;
    }

    @Test
    public void LittleOverAThousand() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1030);
        int expected = 970;
        assertEquals(expected, actual);;
    }
}