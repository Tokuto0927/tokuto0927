// example_otherパッケージのMainクラス
package example_other;

import example.Sushi;

public class Main {
    public static void main(String[] args) {
        Sushi sushi = new Sushi("寿司"); 
        if (sushi == null) {
            System.out.println("寿司のインスタンスが存在しません。"); 
        } else {
            sushi.printInfo();
        }
    }
}

