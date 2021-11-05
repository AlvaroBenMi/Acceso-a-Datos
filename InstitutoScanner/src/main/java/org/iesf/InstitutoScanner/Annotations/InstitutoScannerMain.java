package org.iesf.InstitutoScanner.Annotations;

import org.iesf.InstitutoScanner.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InstitutoScannerMain {
    private static Logger log = LoggerFactory.getLogger(InstitutoScannerMain.class);
    public static void main(String[] args) {
        // Se crea el contexto de la aplicacion
        // Se crean los beans y se inyectan las dependencias

        ApplicationContext context =

                new AnnotationConfigApplicationContext(
                        InstutoScannerconfiguration.class);

        // Sacamos el bean org.iesf.InstitutoScanner.StudentReader del contexto de la aplicacion
        StudentReader programa = context.getBean(StudentReader.class);

        // Leemos un estudiante
        Student student = programa.readStudent();
        log.info(student.toString());

        GroupReader programa2 = context.getBean(GroupReader.class);

        Group group = programa2.readGroup();
        log.info(group.toString());

        InstitutoReader programa3 = context.getBean(InstitutoReader.class);

        Instituto instituto = programa3.readInstituto();
        log.info(instituto.toString());
    }
}
