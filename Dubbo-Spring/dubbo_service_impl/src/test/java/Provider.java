import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Beloved
 * @date 2020/9/5 15:00
 */
public class Provider {

    public static void main(String[] args) throws IOException {
//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dubbo.xml");
//        ac.start();
//        System.out.println("启动成功");
//        System.in.read();

        // 官方推荐
        // 要求配置文件必须放在 /META-INF/spring/*.xml
        Main.main(args);
    }

}
