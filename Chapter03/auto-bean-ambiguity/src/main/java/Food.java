import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Food {

    Dessert dessert;


    @Autowired
    /*设置的参数就是想要注入的bean的ID，更准确地讲，@Qualifier所引用的bean要具有String类型的“iceCream”
     * 作为限定符，如果没有指定其他的限定符的话，所有的bean都会给定一个默认的限定符，这个限定符与bean的ID相同
     * ，因此框架会将具有“iceCream”限定符的bean注入到setDessert()方法中。这恰巧就是ID未iceCream的bean
     * 它是组件扫描的时候创建的
     * 基于默认的beanID作为限定符式非常简单的，但这有可能会引入一些问题。如果你重构了IceCream类，将其重命名
     * 为Gelato的话，那此时会发生什么情况呢？如果这样的话，bean的ID和默认的下东宁府会变为gelato，这就无法
     * 匹配setDessert()方法中的限定符。自动装配会失败。
     * 这个问题在于setDessert()方法上所指定的限定符与要注入的bean的名称是紧耦合的。对类名称的任意改动都会导致
     * 限定符失效。
     *
     * */
    /*@Qualifier("clod")*/
    @Cold
    @Creamy
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }


    public void likeFood(){
        dessert.eat();
    }
}
