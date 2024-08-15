package rafael.gerenciador_de_riscos_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.gerenciador"})
public class GerenciadorDeRiscosBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorDeRiscosBackendApplication.class, args);
    }
}
