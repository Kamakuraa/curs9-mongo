package ro.fasttrackit.mongodemo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ro.fasttrackit.mongodemo.model.Room;
import ro.fasttrackit.mongodemo.repository.RoomRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RoomService {
  private final RoomRepository repository;

  public List<Room> getAll(String number) {
    return Optional.ofNullable (number)
      .map (repository::findByRoomNumber)
      .orElseGet (repository::findAll);
  }
}
