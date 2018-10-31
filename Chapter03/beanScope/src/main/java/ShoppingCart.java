import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
/*这里将value设置成了WebApplicationContext中的SCOPE_SESSION常量（它的值是session）
* 这回告诉Spring为Web应用中的每个会话创建一个ShoppingCart。这会创建多个ShoppingCart bean的实例
* 但是对于给定的会话只会创建一个实例，在当前会话相关的操作中，这个bean实际上相当于单例的
* proxyMode被设置成了ScopedProxyMode.INTERFACES这个属性解决了将会话或请求作用域的bean注入到单例bean中所遇到的问题。

StoreService.java

现在，我们带着对这个作用域的理解，讨论一下proxyMode属性，入配置所示，proxyMode属性被设置省了ScopeProxyMode.INTERFACES,
这表明这个代理要实现ShoppingCart接口，并将调用委托给实现bean。
如果ShoppingCart是接而不是类的话，这是可以的（也是最为理想的代理模式）。但如果ShoppingCart是一个具体的类的话，spring就没有办法创建基于接口的代理
此时，它必须使用CGLib来生成基于类的代理，所有，如果bean类型是具体类的话，我们必须要将proxyMode属性设置为ScopedProxyMode.TARGET_CLASS,以此来表明要
以生成目标类扩展的方式创建代理。

尽管我主要关注了会话作用域，但是请求作用域的bean会面临相同的装配问题。因此，请求作用域的bean应该也以作用域代理的方式进行注入。
* */
@Scope(value = WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.INTERFACES)
public class ShoppingCart {

}
