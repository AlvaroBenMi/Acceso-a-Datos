import Exceptions.NotANumbersException;

import java.util.List;

public class Calculator {
    static int suma(List<Integer> numbers) throws NotANumbersException {
        if(numbers.isEmpty()){
            throw new NotANumbersException();
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }
}
