package me.dio.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.domain.model.Card;
import me.dio.service.CardService;

@RestController
@RequestMapping("/cards")
public class CardController {

  private final CardService cardService;

  public CardController(CardService cardService) {
    this.cardService = cardService;
  }

  @GetMapping("/{name}")
  public ResponseEntity<Card> findById(@PathVariable String name) {
    var card = cardService.findByName(name);
    return ResponseEntity.ok(card);
  }

  @PostMapping("/{name}")
  public ResponseEntity<Card> create(@RequestBody Card cardToCreate) {
    var cardCreated = cardService.create(cardToCreate);
    URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(cardCreated.getName())
        .toUri();
    return ResponseEntity.created(location).body(cardCreated);
  }

}
