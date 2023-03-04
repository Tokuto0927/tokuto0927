package adventure;

public class Player extends Character {
    public Player(String name) {
        super(name);
    }

    public void greet() {
        System.out.println("こんにちは " + this.name + " さん");
    }

    public void adventure() {
        System.out.println("さあ冒険に出かけよう！");
    }
}
