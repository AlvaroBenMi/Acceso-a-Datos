package Company;

import Company.Configuration.CompanyConfiguration;
import Company.Menu.Menu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompayMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        CompanyConfiguration.class
                );
        Menu menu = context.getBean(Menu.class);
        menu.chooseOption();
    }
}
