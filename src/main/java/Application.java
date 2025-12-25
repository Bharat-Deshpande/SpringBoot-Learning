import com.learning.SpringBoot.Basics.PaymentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration   this annotation helps to convert the spring project to springboot project
public class Application{ // implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


    //1. field injection
    //@Autowired
//    private final PaymentService paymentService;
//
//    // 2. constructor injection, this one is better because you are explicitly specifying that this class is dependent on this this particular things.
//    // tou can declare it as final if constructor injection used.
//    public Application(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
//
//    // These all IOC, autowired, bean helps us in loose coupling
//
//
//    @Override
//    public void run(String... args) {
//        String payment = paymentService.pay();
//        System.out.printf("Payment done: "+payment);
//    }
}

//What happens when you start the springboot application:
// 1. JVM starts and main method is executed

// 2. SpringApllicaiton.run(MyApp.class, args

// 3. Spring Boot detects: @SpringBootApplication on mYapp.class
// which includes:
// @SpringBootConfiguration -> marks as @Configuration
// @ComponentScan -> scans current and sub packages
// @EnableAutoConfiguration -> loads auto-configs from spring.factories

// 4. Creates SpringApplication object:
// setup application context
// setup environment
// Regosters listeners and initializers

// 5. ApplicationContect is created

// 6. environment is prepared (e.g., application.properties, args, profiles)

// 7. Beans are scanned and registered via @ComponentScan a nd auto-configured beans are registered (e.g., Datasource and webservers)

// 8. ApplicationContext is refreshed:-
// -all beans are created
// -Dependencies are autoconfigured
// -Lifecycle methods are called

// 9. Embedded web servers is started

// 10. CommandLineRunner or ApplicationRunner beans are executed

// 11. Application is now fully started and ready to serve.

















