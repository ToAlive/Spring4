import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
/*@Qualifier("clod")*/
@Cold
@Fruity
/*如果多个bean都具备相同特性的话，这种做也会出现问题。此时需要更多的限定符来讲可选范围限定到只有一个bean
* 但Java不允许在同一个条目上重复出现相同类型的多个注解。
* 因此我我们可以创建自定义的限定符注解*/
/*@Qualifier("fruity")*/

public class Popsicle implements Dessert{
    @Override
    public void eat() {
        System.out.println("Popsicle...");
    }
}
