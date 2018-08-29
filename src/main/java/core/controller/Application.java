package core.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages={"core.service","core.controller"})
@SpringBootApplication
@RestController
public class Application {
	
	@RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }
	
	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args);
	}

}
