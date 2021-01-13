package day11.task2;

public class Magician extends Hero implements MagicAttack {
    int magicAttak = 20;

    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double physAttacHero = magicAttak * (1 - hero.magicDef);
        if (hero.health - physAttacHero < 0) {
            hero.health = 0;
        } else
            hero.health -= physAttacHero;

    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
