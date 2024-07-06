package Helloworld;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App02HelloWorldSpring {

	public static void main(String[] args) {
	//	SpringApplication.run(App02HelloWorldSpring.class, args);

		var context= new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("address"));

	}

}
