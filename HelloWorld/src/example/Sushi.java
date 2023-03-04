// exampleパッケージのSushiクラス
package example;

public class Sushi {
    private String name;

    // 引数を受け取るコンストラクタ
    public Sushi(String name) {
        this.name = name;
    }

    // メソッド
    public void printInfo() {
        System.out.println(name + "はうまい");
        System.out.println(name + "は和食です");
    }
}
