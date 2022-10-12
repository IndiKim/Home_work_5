package com.company;

public class Boss {

    private String bossHealth;
    private int getBossDamage;
    private String bossAttackType;

    public Boss(String bossHealth, int getBossDamage, String bossAttackType) {
        this.bossHealth = bossHealth;
        this.getBossDamage = getBossDamage;
        this.bossAttackType = bossAttackType;
    }

    public String getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(String bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getGetBossDamage() {
        return getBossDamage;
    }

    public void setGetBossDamage(int getBossDamage) {
        this.getBossDamage = getBossDamage;
    }

    public String getBossAttackType() {
        return bossAttackType;
    }

    public void setBossAttackType(String bossAttackType) {
        this.bossAttackType = bossAttackType;
    }
}
