import Exceptions.NotANumbersException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CalculatorWithTests {
    @Test

    public void sumaTest() throws NotANumbersException {
        List<Integer> numbers = Arrays.asList();

        int res = Calculator.suma(numbers);

        Assert.assertEquals(12, res);
    }
}
