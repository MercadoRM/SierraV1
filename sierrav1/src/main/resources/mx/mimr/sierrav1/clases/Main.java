package mx.mimr.sierrav1.clases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
	
	public static void main(String []args)
	{
		SpringApplication.run(Main.class, args);
	}
	
	@RequestMapping("/saludo")
	public String saludar()
	{
		return "Hola Mundo";
	}
}
