import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndAlmostLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 16666_66;
        boolean registered = true;
        long expected = 499;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndEqualLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 16666_67;
        boolean registered = true;
        long expected = 500;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 2000000_60;
        boolean registered = true;
        long expected = 500;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndAlmostLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 49999_99;
        boolean registered = false;
        long expected = 499;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndEqualLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 50000_00;
        boolean registered = false;
        long expected = 500;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 100000_00;
        boolean registered = false;
        long expected = 500;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
}