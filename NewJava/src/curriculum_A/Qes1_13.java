package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO  1 ローカル変数の宣言
		byte glasses; // バイト型
		short age; // 短整数型
		int salary; // 整数型
		long people; // 長整数型
		float weight; // 単精度浮動小数点数型
		double pi; // 倍精度浮動小数点数型
		char initial; // 文字型
		String name; // 文字列型
		boolean isError; // ブーリアン型
		
		// TODO 2 ローカル変数の初期値
		glasses = 0; // バイト型
		age = 0; // 短整数型
		salary = 0; // 整数型
		people = 0L; // 長整数型
		weight = 0.0F; // 単精度浮動小数点数型
		pi = 0.0; // 倍精度浮動小数点数型
		initial = '\u0000'; // 文字型
		name = null; // 文字列型
		isError = false; // ブーリアン型
		
		// TODO 3 値の代入
		glasses =10;
		age = 100;
		salary = 1000;
		people = 10000l;
		weight = 9.5f;
		pi = 10.5;
		initial ='a';
		name = " ハロー ";
		isError = true;
		
		// TODO 4 コンソール出力
		System.out.println(glasses + age + salary + people);
		System.out.println( 2 * glasses);
		System.out.println(initial  + name +  isError);
		System.out.println(glasses + age + salary + people + 2 * glasses);
		System.out.println(glasses * age * salary * people);
		System.out.println(pi / age);
		System.out.println(glasses - age);
		
		// TODO 5 「ハローJAVA43」と表示とさせたい。 正しく動作するように修正してください。
		int num= 20; // 20が文字列として判断されていたためint型に
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		
		// TODO 6 『山田太郎 18歳 170.5cm 62.2kg 寿司』と出力
		String name1 = "田中太郎";
		short age1 = 18;
		double height1 = 170.5;
		double weight1 = 62.2;
		String food1 = "寿司";
		System.out.println("初めまして" + name1 + "です");
		System.out.println("年齢は" + age1 +"歳です");
		System.out.println("身長は" + height1 +"cmです");
		System.out.println("体重は" + weight1 +"kgです");
		System.out.println("好きな食べ物は" + food1 +"です");
		
		// TODO 7　作成した自己紹介に続いてBMIが出力されるように
		double bmi = weight1 / Math.pow(height1/100, 2);
		System.out.println("BMIは"+ String.format("%.1f", bmi) + "です");
		
		// TODO 8　６で宣言した変数に再代入しコンソールに出力
		name1 = "鈴木一郎";
		age1 = 24;
		height1 = 168.5;
		weight1 = 64.2;
		food1 = "オムライス";
		System.out.println("初めまして" + name1 + "です");
		System.out.println("年齢は" + age1 +"歳です");
		System.out.println("身長は" + height1 +"cmです");
		System.out.println("体重は" + weight1 +"kgです");
		System.out.println("好きな食べ物は" + food1 +"です");
		bmi = weight1 / Math.pow(height1/100, 2);
		System.out.println("BMIは"+ String.format("%.1f", bmi) + "です");
		
		// TODO 9　8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		int ageSum = age1 + age1;
		double heightSum = height1 + height1;
		double weightSum = weight1 + weight1;
		System.out.println("初めまして" + name1 + "です");
		System.out.println("年齢は" + ageSum +"歳です");
		System.out.println("身長は" + heightSum +"cmです");
		System.out.println("体重は" + weightSum +"kgです");
		System.out.println("好きな食べ物は" + food1 +"です");
		bmi = weightSum / Math.pow(heightSum/100, 2);
		System.out.println("BMIは"+ String.format("%.1f", bmi) + "です");
		
		// TODO　10　8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		boolean isAbove25 = age1 >= 25;
        System.out.println(isAbove25);
        
		// TODO 11 型変換　文字型
        String ageStr = String.valueOf(age1);
        String heightStr = String.valueOf(height1);
        String weightStr = String.valueOf(weight1);
        System.out.println(ageStr + heightStr + weightStr);
        
		// TODO 12 型変換　整数型
        int ageInt = (int) age1;
        int heightInt = (int) height1;
        System.out.println(ageInt);
        System.out.println(heightInt);
        
		// TODO　13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
        boolean check = ageInt == 25 || heightInt >=160;
        System.out.println(check);
	}

}
