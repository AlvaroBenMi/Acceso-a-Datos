import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Scanner;

public class InstitutoFileScanner {
    private final static Logger log = LoggerFactory.getLogger(InstitutoFileScanner.class);

    public File getFile(){
        Scanner scan = new Scanner(System.in);
        log.info("Introduce el path al archivo del instituto");
        String filePath = scan.nextLine();
        return new File(filePath);
    }
}
