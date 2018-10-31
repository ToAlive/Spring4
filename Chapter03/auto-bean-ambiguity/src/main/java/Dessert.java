/*
* Dessert有三个实现类，分别时Cake，Cookies，IceCream
* 三个实现类上都使用了@Component注解，当Spring试图自动装配setDessert()中的Dessert参数时，
* 它并没有唯一、无歧义的可选值。在从多种甜点中做出选择时，尽管大多数人并不会有什么困难，但是Spring
* 却无法做出选择。Spring此时别无他法，只好宣告失败并抛出异常。更精确地讲，Spring会抛出
* NoUniqueBeanDefinitionException异常。
* 就算这种歧义性确实是个问题，但更常见的情况时给定的类型只有一个实现类，因此自动装配能够很好地运行
* 但是，当确实发生歧义性的时候，Spring提供了多种可选方案来解决这样的问题。你可以讲可选bean中的某一个设为
* 首选（primary）的bean，或者使用限定符（qualifier）来帮助Spring将可选的bean的范围缩小到只有一个bean。
*
*
* 标识首选的bean
*   在声明bean的时候，通过将其中一个可选的bean设置为首选(primary)bean能够避免自动装配时的歧义性。
*   当遇到歧义性的时候，Spring将会使用首选的bean，而不是其他可选的bean。实际上你所声明的就是“最喜欢”的bean
*   在Spring中可以用@Primary来标识首选的bean,
*   @Primary能够与@Component组合用在组件扫描的bean上
*   也可以与@Bean组合用在Java配置的bean声明中
*
*限定自动装配的bean
*   设置首选bean的局限性在于@Primary无法将可选方案的范围限定到唯一一个无歧义的选项。
*   它只能标识一个优选的可选方案。当首选bean的数量超过一个时,我们并没有其他的方法进一步缩小可选范围。
*   与之相反，Spring的限定符能够在所有可选的bean上进行缩小范围的操作，最终能够达到只有一个bean满足
*   所规定的限制条件。如果将所有的限定符都用上后依然存在歧义性，那么你可以继续使用更多的限定符来缩小选择范围
*   @Qualifier注解时使用限定符的主要方式。它可以与@Autowired和@Inject协同使用，在注入的时候指定想要
*   注入进去的时那个bean。
*
* */
public interface Dessert {
    void eat();
}
