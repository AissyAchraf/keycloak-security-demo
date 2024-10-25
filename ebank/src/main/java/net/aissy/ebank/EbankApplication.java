package net.aissy.ebank;

import net.aissy.ebank.entity.Customer;
import net.aissy.ebank.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EbankApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbankApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(
                    Customer.builder()
                            .name("Mohamed")
                            .email("med@gmail.com")
                            .build()
            );
            customerRepository.save(
                    Customer.builder()
                            .name("Yassine")
                            .email("yassine@gmail.com")
                            .build()
            );
            customerRepository.save(
                    Customer.builder()
                            .name("Imane")
                            .email("imane@gmail.com")
                            .build()
            );
        };
    }
}
