package adventure;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tokuto");
        player.greet();
        player.printStatus();
        player.adventure();
    }
}
