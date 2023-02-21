import org.example.CalcService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcServiceTest {

    @ParameterizedTest
    @CsvSource({
            "10,3,20,3",
            "100,60,150,2"
    })

    public void shouldCalcMons(int income, int expenses, int threshold, int expected) {
        CalcService service = new CalcService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected,actual);
    }


}
