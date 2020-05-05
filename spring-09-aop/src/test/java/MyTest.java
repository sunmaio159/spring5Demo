import com.sun.service.UserSerive;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserSerive userService = context.getBean("userService", UserSerive.class);
        userService.add();
    }
}
