package me.dio.service;

import me.dio.domain.model.Card;

public interface CardService {
  Card findByName(String name);

  Card create(Card cardToCreate);
}
