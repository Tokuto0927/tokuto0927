package animal;

import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください");

        String input = scanner.nextLine();

        if (input == null) {
            System.out.println("入力がNULLです。");
            return;
        }

        if (input.trim().isEmpty()) {
            System.out.println("入力が空です。");
            return;
        }

        String[] animals = input.split(",");
        for (String animal : animals) {
            String[] attributes = animal.split(":");
            String name = attributes[0];
            double length = Double.parseDouble(attributes[1]);
            int speed = Integer.parseInt(attributes[2]);
            String scientificName = getScientificName(name);

            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + scientificName);
            System.out.println();
        }
    }

    public static String getScientificName(String name) {
        switch (name) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            default:
                return "不明";
        }
    }
}
