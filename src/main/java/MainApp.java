

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses= {ImageRepository.class})
public class MainApp {
   public static void main(String[] args) {
       SpringApplication.run(MainApp.class, args);
   }
}