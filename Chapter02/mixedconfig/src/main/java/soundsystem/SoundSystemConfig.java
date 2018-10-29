package soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
/*方法二：创建一个更高级别的JavaConfig类，在这个类中使用@Import将两个JavaConfig配置组合在一起*/
/*@Import({CDPlayerConfig.class,CDConfig.class})*/
@Import(CDPlayerConfig.class)
@ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {
}
