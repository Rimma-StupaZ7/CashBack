package ru.netology.service;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CashbackHackerServiceTest {
    @Test
    public void CashbackHackService() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(700);
        int expected = 300;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void AmountWhenSpentAThousand() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void WenSpendMin() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShowAmountWhenFullThousand() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void LittleOverAThousand() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1030);
        int expected = 970;
        Assert.assertEquals(actual, expected);
    }
}