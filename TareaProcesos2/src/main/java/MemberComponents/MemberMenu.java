package MemberComponents;

import Member.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Scanner;

public class MemberMenu {
    private static Logger log = LoggerFactory.getLogger(MemberMenu.class);
    private static Scanner scan = new Scanner(System.in);




    private void menu() {
        log.info("\n" +
                "// ** MAIN MENU ** //" + "\n" +
                "1. Members list" + "\n" +
                "2. Add member" + "\n" +
                "3. Delete member by nif" + "\n" +
                "4. Modify member" + "\n" +
                "5. Exit" + "\n"
        );
    }

    public void chooseOption() {
        MemberService memberService = new MemberService();
        int option;

        do {
            log.info("Elige una acción");
            menu();
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {

                case 1:
                    log.info("SHOW MEMBER LIST");
                    memberService.listMembers();
                    break;

                case 2:
                    log.info("ADD MEMBER");
                    memberService.addMember();
                    break;

                case 3:
                    log.info("DELETE MEMBER BY NIF");
                    memberService.deleteMemberByNif();
                    break;

                case 4:
                    log.info("MODIFY MEMBER");
                    memberService.modifyMember();
                    break;
            }

        } while (option != 5);
    }
}
