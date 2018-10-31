import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/*它本身需要使用@Qualifier注解来标注，这样我们将不在使用@Qualifier("cold")而是使用自定义的@Cold注解*/
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Cold {
}
