import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class InventoryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @GetMapping("/")
    public Object root() {
        return new ServiceResponse("inventory", "Java", "Spring Boot");
    }

    @GetMapping("/health")
    public String health() {
        return "ok";
    }

    record ServiceResponse(String service, String language, String framework) {}
}
