package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_carta")
public class Card {

  @Id
  private String name;

  private int attack;

  private int defense;

  private String attribute;

  private String race;

  private String description;

  private String artImageUrl;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAttack() {
    return attack;
  }

  public void setAttack(int attack) {
    this.attack = attack;
  }

  public int getDefense() {
    return defense;
  }

  public void setDefense(int defense) {
    this.defense = defense;
  }

  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getArtImageUrl() {
    return artImageUrl;
  }

  public void setArtImageUrl(String artImageUrl) {
    this.artImageUrl = artImageUrl;
  }

}
