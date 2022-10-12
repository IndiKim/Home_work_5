package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss("1000", 200, "Sword");

        System.out.println("Health: "+boss.getBossHealth() +"\nAttack type: "+
                boss.getBossAttackType()+"\nDamage: "+ boss.getGetBossDamage());
    }
}
