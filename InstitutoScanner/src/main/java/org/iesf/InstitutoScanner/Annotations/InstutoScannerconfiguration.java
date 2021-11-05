package org.iesf.InstitutoScanner.Annotations;

import org.iesf.InstitutoScanner.GroupReader;
import org.iesf.InstitutoScanner.Instituto;
import org.iesf.InstitutoScanner.InstitutoReader;
import org.iesf.InstitutoScanner.StudentReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class InstutoScannerconfiguration {

    @Bean
    public StudentReader studentReader(Scanner scanner) {
        return new StudentReader(scanner);
    }

    @Bean
    public GroupReader groupReader(Scanner scanner) {
        return new GroupReader(scanner);
    }

    @Bean
    public InstitutoReader institutoReader(Scanner scanner) {return new InstitutoReader(scanner);
    }

    @Bean
    public Scanner scanner(){return new Scanner(System.in);}

}
