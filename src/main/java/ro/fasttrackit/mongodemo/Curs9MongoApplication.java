package ro.fasttrackit.mongodemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.mongodemo.model.Room;
import ro.fasttrackit.mongodemo.repository.RoomRepository;

import java.util.List;

@SpringBootApplication
public class Curs9MongoApplication {

  public static void main(String[] args) {
    SpringApplication.run (Curs9MongoApplication.class, args);
  }
  @Bean
  CommandLineRunner startup(RoomRepository repo){
    return args -> {
      repo.saveAll(List.of(
        new Room ("22C"),
        new Room("23A"),
        new Room("3")
      ));
    };
  }
}
