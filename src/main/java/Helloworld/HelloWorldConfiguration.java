package Helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record Address(String firstline, String city){};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
      return "Mohit";

    }
    @Bean
    public int age (){
        return 5;
    }

    @Bean
    public Person person(){
        var person = new Person("Ravi", 20);
        return person;
    }
    @Bean
    public Address address(){
        var address = new Address("Opaczewska 40/29", "Warsaw");
        return address;
    }
    @Bean
    public Person person2(){
        var person2 = new Person(name(), age());
        return person2;
    }
}
