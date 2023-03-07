package prefecture;

/*
	
	0, "北海道:札幌市:83424"
1, "青森県:青森市:9646"
2, "岩手県:盛岡市:15275"
3, "宮城県:仙台市:7282"
4, "秋田県:秋田市:11638"
5, "山形県:山形市:9323"
6, "福島県:福島市:13784"
7, "茨城県:水戸市:6097"
8, "栃木県:宇都宮市:6408"
9, "群馬県:前橋市:6362"
10, "埼玉県:さいたま市:3798"
	
	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8
	5
	9
	と入力された場合（昇順）
	
	都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
	
	都道府県名：栃木県
県庁所在地：宇都宮市
面積：6408.0km2

	都道府県名：群馬県
県庁所在地：前橋市
面積：6362.0km2

*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prefecture[] prefectures = {
            new Prefecture(0,"北海道","札幌市", 83424),// 0
            new Prefecture(1,"青森県","青森市", 9646),// 1
            new Prefecture(2,"岩手県","盛岡市", 15275),// 2
            new Prefecture(3,"宮城県","仙台市", 7282),// 3
            new Prefecture(4,"秋田県","秋田市", 11638),// 4
            new Prefecture(5,"山形県","山形市", 9323),// 5
            new Prefecture(6,"福島県","福島市", 13784),// 6
            new Prefecture(7,"茨城県","水戸市", 6097),// 7
            new Prefecture(8,"栃木県","宇都宮市", 6408),// 8
            new Prefecture(9,"群馬県","前橋市", 6362),// 9
            new Prefecture(10,"埼玉県","さいたま市", 3798)// 10
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("数字を入力してください（スペースまたはカンマ区切り）:");
        String[] inputNumbers = scanner.nextLine().split("[, ]");

        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        System.out.println("昇順(1)か降順(2)を選んでください:");
        int order = scanner.nextInt();

        // 数字がランダムに入力されても昇降順に表示
        Arrays.stream(prefectures)
              .sorted(order == 1 ? Comparator.comparing(Prefecture::getNum) : Comparator.comparing(Prefecture::getNum).reversed())
              .filter(p -> Arrays.stream(numbers).anyMatch(num -> num == p.getNum()))
              .forEach(p -> {
                  System.out.println("都道府県名：" + p.getName());
                  System.out.println("県庁所在地：" + p.getCapital());
                  System.out.println("面積：" + p.getArea() + "km2\n");
              });
    }
}
