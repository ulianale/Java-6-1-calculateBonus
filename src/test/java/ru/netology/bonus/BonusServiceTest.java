package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {

    @ParameterizedTest
/*  @CsvSource(
            value = {
                    "'registered user bonus, under limit',1000,true,30",
                    "'registered user bonus, over limit',100000060,true,500",
                    "'unregistered user bonus, under limit',1000,false,10",
                    "'unregistered user bonus, over limit',100000,false,500"
            }
    )

*/
    @CsvFileSource(resources = "/data.csv")

    public void shouldCalculate(String ignored, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calculateBonus(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}

