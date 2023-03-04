package adventure;

import java.util.Random;

public class Character {
    protected String name;
    protected int hp;
    protected int mp;
    protected int attack;
    protected int agility;
    protected int defense;

    public Character(String name) {
        this.name = name;
        Random random = new Random();
        this.hp = random.nextInt(1000) + 1;
        this.mp = random.nextInt(1000) + 1;
        this.attack = random.nextInt(500) + 1;
        this.agility = random.nextInt(500) + 1;
        this.defense = random.nextInt(100) + 1;
    }

    public void printStatus() {
        System.out.println("ステータス");
        System.out.println("HP：" + this.hp);
        System.out.println("MP：" + this.mp);
        System.out.println("攻撃力：" + this.attack);
        System.out.println("素早さ：" + this.agility);
        System.out.println("防御力：" + this.defense);
    }
}
