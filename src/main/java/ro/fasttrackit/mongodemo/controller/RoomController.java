package ro.fasttrackit.mongodemo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.mongodemo.model.Room;
import ro.fasttrackit.mongodemo.service.RoomService;

import java.util.List;

@RequestMapping("rooms")
@RestController
@RequiredArgsConstructor
public class RoomController {
  private final RoomService service;

  @GetMapping
  List<Room> getAll(@RequestParam(required = false) String number) {
    return service.getAll (number);
  }
}
