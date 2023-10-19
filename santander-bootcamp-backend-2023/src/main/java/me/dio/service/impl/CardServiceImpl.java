package me.dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.domain.model.Card;
import me.dio.domain.repository.CardRepository;
import me.dio.service.CardService;

@Service
public class CardServiceImpl implements CardService {

  private final CardRepository cardRepository;

  public CardServiceImpl(CardRepository cardRepository) {
    this.cardRepository = cardRepository;
  }

  @Override
  public Card findByName(String name) {
    return cardRepository.findById(name).orElseThrow(NoSuchElementException::new);
  }

  @Override
  public Card create(Card cardToCreate) {

    if (cardRepository.existsByName(cardToCreate.getName())) {
      throw new IllegalArgumentException("This Account number already exists.");
    }

    return cardRepository.save(cardToCreate);
  }
}
