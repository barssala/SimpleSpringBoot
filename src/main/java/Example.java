import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World ON AWS CODE PIPELINE- v3!";
    }

    public static void main(String[] args) throws Exception {
	    System.getProperties().put("server.port", 5000);
        SpringApplication.run(Example.class, args);
    }

}
