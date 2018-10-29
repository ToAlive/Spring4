package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*创建JavaConfig的类关键在于为其添加@Configuration注解，
@Configuration注解表明这个类是一个配置类，该类应该包含在Spring应用上下文中创建bean的细节*/
@Configuration
public class CDPlayerConfig {
    /*申明bean*/
    @Bean(name="lonelyHeartsClubBand")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CompactDisc randomBeatlesCD(){
        int choice = (int) Math.floor(Math.random()*4);
        if(choice == 0){
            return new SgtPeppers();
        }else if(choice == 1){
            return  new WhiteAlbum();
        }else if(choice == 2){
            return new HardDaysNight();
        }else{
            return new Revolver();
        }
    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        //构造器风格实现DI
        CDPlayer cdPlayer = new CDPlayer(compactDisc);
        //Setter风格实现DI
        /*cdPlayer.setCd(compactDisc);
        return cdPlayer;*/
        return new CDPlayer(compactDisc);
    }

}

