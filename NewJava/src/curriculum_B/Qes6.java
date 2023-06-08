package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("家電のリストを入力してください（商品は「、」で区切ってください）：");
        String input = scanner.nextLine();

        String[] products = input.split("、");
        int maxCount = 11;
        Random random = new Random();

        for (String product : products) {
            switch (product) {
            	case "パソコン":
            	case "冷蔵庫":
                    int remainingCount = maxCount - random.nextInt(12);
                    String message = (product.equals("パソコン")) ? "パソコン" : "冷蔵庫";
                    System.out.println(message + "の残り台数は" + remainingCount + "台です");
                    break;
            	case "テレビ":
                case "ディスプレイ":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                
                    remainingCount = random.nextInt(12);
                    System.out.println(product + "の残り台数は" + remainingCount + "台です");
                    break;
                default:
                    System.out.println("『" + product + "』は指定の商品ではありません");
                    break;
            }
        }
    }
}
