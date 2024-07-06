package Examplesss;

import game.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class YourBusinessclass{

    Dependency1 dependency1;

    Dependency2 dependency2;

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setting dep1");
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Settinh dep2");
        this.dependency2 = dependency2;
    }

    public String toString(){
        return "Using " + dependency1 + "and " + dependency2;
    }

}
@Component
class Dependency1{


}

@Component
class Dependency2{

}
@SpringBootApplication
@Configuration
@ComponentScan("Examplesss")
public class DILauncherApplication {


    public static void main(String[] args) {
        SpringApplication.run(DILauncherApplication.class, args);
        try(var context = new AnnotationConfigApplicationContext(DILauncherApplication.class)) {

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(YourBusinessclass.class));
        }
    }

}