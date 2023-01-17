import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catbean = (Cat) applicationContext.getBean("beanCat");
        Cat catbean2 = (Cat) applicationContext.getBean("beanCat");

        System.out.println("Равны ли бины HelloWorld ?" + (bean==bean2));
        System.out.println("Равны ли бины Коты ?" + (catbean2==catbean));
    }
}