package MemberComponents;

import Member.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class MemberReader {
    private static Logger log = LoggerFactory.getLogger(MemberReader.class);

    private Scanner scan;

    public MemberReader(Scanner scan) {
        this.scan = scan;
    }

    public Member readMember(){
        log.info("Introduce nif");
        String nif = scan.nextLine();
        log.info("Introduce nombre");
        String name = scan.nextLine();
        log.info("Introduce apellido");
        String surname = scan.nextLine();
        log.info("Introduce codigo postal");
        int cp = scan.nextInt();

        return new Member(nif, name, surname, cp);
    }
}
