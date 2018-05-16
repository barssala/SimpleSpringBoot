import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World ON AWS CODE PIPELINE by Bass!";
    }

	@RequestMapping(value="/print/{message}", method=RequestMethod.GET)
	String printMessage(@PathVariable String message) {
    	return message == null ? "No message, please send some messages" : message;
	}

    public static void main(String[] args) throws Exception {
	    System.getProperties().put("server.port", 5000);
        SpringApplication.run(Example.class, args);
    }

}
