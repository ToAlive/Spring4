package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/*SpringJUnit4ClassRunner 在测试开始的时候自动创建Spring的应用于上下文*/
@RunWith(SpringJUnit4ClassRunner.class)
/*ContextConfiguration 在指定的classes中加载配置*/
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        /*断言cd不是null*/
        assertNotNull(cd);
    }

    @Test
    public void play(){
        player.play();
    }

}