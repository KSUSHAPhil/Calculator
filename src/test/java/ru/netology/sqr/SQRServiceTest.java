package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources={"/Testdata.csv"})
    public void test(int bottom, int top, int expected) {
        SQRService service = new SQRService();

        int actual = service.CrazyCalc(bottom, top);

        Assertions.assertEquals(expected, actual);

    }

}
