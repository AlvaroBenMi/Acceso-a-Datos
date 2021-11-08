import Configuration.MemberConfiguration;
import MemberComponents.MemberMenu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        MemberConfiguration.class
                );
        MemberMenu menu = context.getBean(MemberMenu.class);
        menu.chooseOption();
    }
}
