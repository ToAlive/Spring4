import org.springframework.stereotype.Component;

@Component
public class Cake implements Dessert{
    @Override
    public void eat() {
        System.out.println("Cake.....");
    }
}
