import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {
    private static Logger log = LoggerFactory.getLogger(ScannerUtils.class);

    private Scanner scanner;

    public ScannerUtils(Scanner scanner) {
        this.scanner = scanner;
    }

    public int scanNumber() {
        Integer num = null;
        while (num == null) {
            try {
                num = scanner.nextInt();
                scanner.nextLine();

            } catch (InputMismatchException e) {
                log.error("error, no es un numero");
            } finally {
                scanner.nextLine();
            }
        }
        return num;
    }
}
