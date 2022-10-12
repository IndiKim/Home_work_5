package com.company;

public class Hero {

    private String heroesHealth;
    private int getHeroesDamage;
    private String heroesAttackType;


    public Hero(String heroesHealth, int getHeroesDamage, String heroesAttackType) {
        this.heroesHealth = heroesHealth;
        this.getHeroesDamage = getHeroesDamage;
        this.heroesAttackType = heroesAttackType;
    }

    public Hero(String heroesHealth, int getHeroesDamage) {
        this.heroesHealth = heroesHealth;
        this.getHeroesDamage = getHeroesDamage;
    }

    public String getHeroesHealth() {
        return heroesHealth;
    }

    public void setHeroesHealth(String heroesHealth) {
        this.heroesHealth = heroesHealth;
    }

    public int getGetHeroesDamage() {
        return getHeroesDamage;
    }

    public void setGetHeroesDamage(int getHeroesDamage) {
        this.getHeroesDamage = getHeroesDamage;
    }

    public String getHeroesAttackType() {
        return heroesAttackType;
    }

    public void setHeroesAttackType(String heroesAttackType) {
        this.heroesAttackType = heroesAttackType;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "heroesHealth='" + heroesHealth + '\'' +
                ", getHeroesDamage=" + getHeroesDamage +
                ", heroesAttackType='" + heroesAttackType + '\'' +
                '}';
    }
}
