package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
/*声明属性源，这个属性文件会加载到spring的Environment中，稍后可以从这里检索属性*/
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment env;

    @Bean
    public BlankDisc disc(){
        return new BlankDisc(env.getProperty("disc.title"),env.getProperty("disc.artist"));
    }
}
