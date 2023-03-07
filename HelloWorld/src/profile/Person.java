package profile;


/* 

問題1：インスタンスフィールドを定義してください

問題2：コンストラクタを定義してください（下記それぞれの引数）

name,age,height

問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください

問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）

*/

public class Person {
    String name;
    int age;
    double height;
    double weight;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    
    // 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）

	// 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
    
    public double bmi() {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }
    
    // 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
    // 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」と出力してください
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "歳です");
    }
    
   

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
