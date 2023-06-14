package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ユーザー名を入力してください: ");
        String userName = scanner.nextLine();

        if (userName == null || userName.length() <= 0) {
            System.out.println("名前を入力してください");
        } else if (userName.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
        } else if (!userName.matches("[a-zA-Z0-9]+")) {
            System.out.println("半角英数字のみで名前を入力してください");
        } else {
            System.out.println("ユーザー名「" + userName + "」を登録しました");
        }

        String[] handNames = {"グー", "チョキ", "パー"};
        int totalAttempts = 1;
        int drawCount = 0;

        while (true) {
            System.out.print("自分の手を選んでください（0:グー, 1:チョキ, 2:パー）: ");
            int userHand = scanner.nextInt();
            scanner.nextLine();  // 改行読み取り

            if (userHand < 0 || userHand > 2) {
                System.out.println("正しい手を選んでください！");
                continue;
            }

            System.out.println(userName + "の手は「" + handNames[userHand] + "」");

            int computerHand = (int) (Math.random() * 3);  // 0から2までの乱数を生成
            System.out.println("相手の手は「" + handNames[computerHand] + "」");

            if (userHand == computerHand) {
                System.out.println("DRAW あいこ もう一回しましょう！");
                drawCount++;
            } else if ((userHand == 0 && computerHand == 1) ||
                    (userHand == 1 && computerHand == 2) ||
                    (userHand == 2 && computerHand == 0)) {
                System.out.println("やるやん。次は俺にリベンジさせて");
                break;
            } else {
                if (userHand == 0) {
                    System.out.println("俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！");
                } else if (userHand == 1) {
                    System.out.println("俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ");
                } else {
                    System.out.println("俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");
                }

                totalAttempts++;
               
            }
        }

        
        System.out.println("勝つまでにかかった合計回数は" + (totalAttempts + drawCount) + "回です");
    }
}
