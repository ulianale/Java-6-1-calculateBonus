package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")

    public void shouldCalculate(String ignored, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calculateBonus(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}
