package Template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@SpringBootApplication
@Configuration
@ComponentScan("Examplesss")
public class DILauncherApplication {


    public static void main(String[] args) {
        SpringApplication.run(DILauncherApplication.class, args);
        try(var context = new AnnotationConfigApplicationContext(DILauncherApplication.class)) {

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }
    }

}