import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*将bean的作用域声明为原型*/
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
/*也可以使用@Scope("prototype")*/
public class Notepad {
}
