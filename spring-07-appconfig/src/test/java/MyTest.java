import com.sun.config.Config;
import com.sun.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
