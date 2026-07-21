package gr.aueb.cf.schoolapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SchoolappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolappApplication.class, args);
    }

}
