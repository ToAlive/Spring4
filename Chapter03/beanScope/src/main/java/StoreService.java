import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
因为StoreService是一个单例的bean，会在spring应用上下文加载的时候创建。
当它创建的时候，spring会试图将ShoppingCart bean注入到setShoppingCart()方法中。
但是ShoppingCart bean是会话作用域的，此时并不存在。
直到某个用户进入系统，创建了会话之后，才会出现ShoppingCart实例。
另外，系统中将会有多个ShoppingCart实例：每个用户一个，
我们并不想让spring注入某个固定的ShoppingCart实例到StoreService中，
我们希望的是当StoreService处理购物车功能时，它所使用的ShoppingCart实例恰好时当前会话所对应的那一个。
spring并不会将实际的ShoppingCart bean注入到StoreService中，
sprig会注入一个ShoppingCart bean的代理。
这个代理会暴露与ShoppingCart相同的方法，所有StoreService会认为它就是一个购物车。
但是，当StoreService调用ShoppingCart的方法时，
代理会对其进行懒解析并将调用委托给会话作用域内真正ShoppingCart bean。
*/
@Component
public class StoreService {

    private ShoppingCart shoppingCart;

    @Autowired
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
