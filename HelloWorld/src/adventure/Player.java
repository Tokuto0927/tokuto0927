package adventure;

import java.util.Scanner;

public class Player extends Character {
	public Player(String name) {
	    super(name != null ? name : "");
	}
	
	


    public void greet() {
    	name = new Scanner(System.in).nextLine();
        System.out.println("こんにちは " + this.name + " さん");
    }

    public void adventure() {
        System.out.println("さあ冒険に出かけよう！");
    }
    
}
