import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*@Primary与@Component组合使用*/
@Component
/*@Primary*/
/*@Component与@Qualifier组合使用，设置自定义的限定符*/
/*@Qualifier("cold")*/

@Cold
@Creamy
public class IceCream implements Dessert{
    @Override
    public void eat() {
        System.out.println("IceCream...");
    }
}
