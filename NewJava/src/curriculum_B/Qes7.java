package curriculum_B;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Qes7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("生徒の人数を入力してください: ");
        int numStudents = scanner.nextInt();
        
        int[] englishScores = new int[numStudents];
        int[] mathScores = new int[numStudents];
        int[] scienceScores = new int[numStudents];
        int[] socialScores = new int[numStudents];
        
        // 生徒ごとに成績を入力
        for (int i = 0; i < numStudents; i++) {
            System.out.println("生徒" + (i+1) + "の成績を入力してください");
            
            System.out.print("英語の点数: ");
            englishScores[i] = scanner.nextInt();
            
            System.out.print("数学の点数: ");
            mathScores[i] = scanner.nextInt();
            
            System.out.print("理科の点数: ");
            scienceScores[i] = scanner.nextInt();
            
            System.out.print("社会の点数: ");
            socialScores[i] = scanner.nextInt();
            
            System.out.println(); // 改行
        }
        
        // 科目ごとの平均点を計算
        double englishAverage = calculateAverage(englishScores);
        double mathAverage = calculateAverage(mathScores);
        double scienceAverage = calculateAverage(scienceScores);
        double socialAverage = calculateAverage(socialScores);
        
        // 生徒ごとの科目平均点と全体の科目平均点を出力
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        
        for (int i = 0; i < numStudents; i++) {
            double studentAverage = (englishScores[i] + mathScores[i] + scienceScores[i] + socialScores[i]) / 4.0;
            System.out.println("生徒" + (i+1) + "の科目平均点: " + studentAverage);
        }
        
        System.out.println(); // 改行
        System.out.println("全体の英語の平均点: " + englishAverage);
        System.out.println("全体の数学の平均点: " + mathAverage);
        System.out.println("全体の理科の平均点: " + scienceAverage);
        System.out.println("全体の社会の平均点: " + socialAverage);
    }
    
    // 平均値を計算するメソッド
    public static double calculateAverage(int[] scores) {
    	
        int sum = 0;
        
        for (int score : scores) {
            sum += score;
        }
        
        return sum / (double) scores.length;
    }
}
