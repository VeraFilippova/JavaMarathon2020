package day11.task2;

public abstract class Hero implements PhysAttack {
    int health; //(здоровье)
    double physDef; //(процент поглощения физического урона)
    double magicDef; //(процент поглощения магического урона)
    int physAtt; //(величина физической атаки), по необходимости
    int magicAtt; //(величина магической атаки), по необходимости

    public Hero() {
        health = 100;
    }

    public void physicalAttack(Hero hero) {
        double physAttacHero = physAtt * (1 - hero.physDef);
        if (hero.health - physAttacHero < 0) {
            hero.health = 0;
        } else
            hero.health -= physAttacHero;

    }
}
