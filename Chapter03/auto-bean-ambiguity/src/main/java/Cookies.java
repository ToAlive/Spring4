import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert{
    @Override
    public void eat() {
        System.out.println("Cookies...");
    }
}
