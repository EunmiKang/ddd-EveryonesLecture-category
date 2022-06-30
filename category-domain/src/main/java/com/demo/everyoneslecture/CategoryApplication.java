package main.java.com.demo.everyoneslecture;

@SpringBootApplication
@RestController
@EnableBinding(KafkaProcessor.class)
public class CategoryApplication {
    public static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(CategoryApplication.class, args);
    }
}
