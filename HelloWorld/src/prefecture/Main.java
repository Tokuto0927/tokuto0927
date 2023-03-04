package prefecture;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prefecture[] prefectures = {
            new Prefecture("北海道", "札幌市", 83424),
            new Prefecture("青森県", "青森市", 9646),
            new Prefecture("岩手県", "盛岡市", 15275),
            new Prefecture("宮城県", "仙台市", 7282),
            new Prefecture("秋田県", "秋田市", 11638),
            new Prefecture("山形県", "山形市", 9323),
            new Prefecture("福島県", "福島市", 13784),
            new Prefecture("茨城県", "水戸市", 6097),
            new Prefecture("栃木県", "宇都宮市", 6408),
            new Prefecture("群馬県", "前橋市", 6362),
            new Prefecture("埼玉県", "さいたま市", 3798)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("数字を入力してください:");
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println("昇順(1)か降順(2)を選んでください:");
        int order = scanner.nextInt();

        // 都道府県を面積でソート
        if (order == 1) {
            Arrays.sort(prefectures, Comparator.comparing(Prefecture::getArea));
        } else {
            Arrays.sort(prefectures, Comparator.comparing(Prefecture::getArea).reversed());
        }

        // 入力された数字に対応する都道府県を出力
        for (int number : numbers) {
            System.out.println("都道府県名：" + prefectures[number].getName());
            System.out.println("県庁所在地：" + prefectures[number].getCapital());
            System.out.println("面積：" + prefectures[number].getArea() + "km2\n");
        }
    }
}
