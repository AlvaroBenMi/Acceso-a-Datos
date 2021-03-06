package MemberComponents;


import Member.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberService {
    private static final Logger log = LoggerFactory.getLogger(MemberService.class);
    private static final Scanner scan = new Scanner(System.in);

    Map<String, Member> memberList = new HashMap<>();

    public void addMember() {
        log.info("Introduce nif");
        String nif = scan.nextLine();
        log.info("Introduce nombre");
        String name = scan.nextLine();
        log.info("Introduce apellido");
        String surname = scan.nextLine();
        log.info("Introduce codigo postal");
        int cp = scan.nextInt();

        Member member = new Member(nif, name, surname, cp);
        memberList.put("nif", member);

    }

    public void listMembers() {
        log.info(memberList.values().toString());
    }

    public void deleteMemberByNif(String nif) {
        if (memberList.containsKey(nif)) {
            Member member = memberList.get(nif);
            memberList.remove(member);
        }
    }

    public void modifyMember(Member member) {
        log.info("Introduce nif");
        String nif = scan.nextLine();
        log.info("Introduce nombre");
        String name = scan.nextLine();
        log.info("Introduce apellido");
        String surname = scan.nextLine();
        log.info("Introduce codigo postal");
        int cp = scan.nextInt();

        member.setNif(nif);
        member.setName(name);
        member.setSurname(surname);
        member.setCp(cp);
    }
}
