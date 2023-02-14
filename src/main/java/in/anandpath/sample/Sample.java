package in.anandpath.sample;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        servers = {
                @Server(url = "/sample", description = "Test here...")
        }
)

@SpringBootApplication
public class Sample {
    public static void main(String[] args) {
        SpringApplication.run(Sample.class, args);
    }
}
