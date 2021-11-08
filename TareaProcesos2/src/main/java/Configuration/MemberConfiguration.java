package Configuration;


import Member.Member;
import MemberComponents.MemberMenu;
import MemberComponents.MemberReader;
import MemberComponents.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class MemberConfiguration {

    @Bean
    public MemberReader memberReader(Scanner scan){return new MemberReader(scan);}

    @Bean
    public MemberMenu memberMenu(){return new MemberMenu();}

    @Bean
    public MemberService memberService(){return new MemberService();}

}
