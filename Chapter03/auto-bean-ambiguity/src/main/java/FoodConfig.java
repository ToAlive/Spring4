import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class FoodConfig {

    /*@Primary与@Bean组合用在Java配置的bean声明中*/
    @Bean
    /*@Primary*/
    /*@Qualifier也可以与@Bean组合使用*/
    @Qualifier("clod")
    public Dessert iceCream(){
        return new IceCream();
    }
}
