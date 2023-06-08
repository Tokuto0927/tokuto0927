package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("家電のリストを入力してください（商品は「、」で区切ってください）：");
        String input = scanner.nextLine();

        // 入力された商品リストをカンマで分割して配列に格納
        String[] products = input.split("、");
        int maxCount = 11; // 最大個数の設定
        Random random = new Random();

        // 商品リストの各商品に対して処理を行う
        for (String product : products) {
            switch (product) {
                case "パソコン":
                case "冷蔵庫":
                    // パソコンと冷蔵庫の場合は、最大個数からランダムに台数を引いた値が残り台数となる
                    int remainingCount = maxCount - random.nextInt(12);
                    String message = (product.equals("パソコン")) ? "パソコン" : "冷蔵庫";
                    System.out.println(message + "の残り台数は" + remainingCount + "台です");
                    break;
                case "テレビ":
                case "ディスプレイ":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    // テレビ、ディスプレイ、扇風機、洗濯機、加湿器の場合は、0から11までのランダムな値が残り台数となる
                    remainingCount = random.nextInt(12);
                    System.out.println(product + "の残り台数は" + remainingCount + "台です");
                    break;
                default:
                    // 指定された商品以外の場合は、「指定の商品ではありません」と表示する
                    System.out.println("『" + product + "』は指定の商品ではありません");
                    break;
            }
        }
    }
}
