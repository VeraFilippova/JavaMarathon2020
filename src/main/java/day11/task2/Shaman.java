package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    int magicAttack = 15;


    @Override
    public void healHimself() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 50 > 100) {
            hero.health = 100;
        } else {
            hero.health += 25;
        }

    }

    @Override
    public void magicalAttack(Hero hero) {
        double physAttacHero = magicAttack * (1 - hero.magicDef);
        if (hero.health - physAttacHero < 0) {
            hero.health = 0;
        } else
            hero.health -= physAttacHero;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
