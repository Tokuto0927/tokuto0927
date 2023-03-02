package method;

public class Method {

	public static void main(String[] args) {
	    // Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を呼び出してください。
	    sayHello();

	    // Q2：引数として整数を渡すと+1してメソッド（関数）関数を呼び出してコンソールに出力してください。
	    System.out.println(increment(5));

	    // Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
	    System.out.println(multiply(3, 4));

	    // Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
	    System.out.println(multiply(2.5, 6.4));

	    // Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）
	    //     を呼び出して、ループ文を用いてそれぞれの数をコンソールに出力してください。
	    int[] randomNumbers = generateRandomNumbers(3);
	    for (int i = 0; i < randomNumbers.length; i++) {
	        System.out.println(randomNumbers[i]);
	    }

	    // Q6：Q5で作成した関数を用いて、配列の要素の平均値を返すメソッド（関数）を呼び出してコンソールに出力してください。
	    System.out.println(calculateAverage(5));
	}

	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
	public static void sayHello() {
	    System.out.println("Hello Java");
	}

	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
	public static int increment(int num) {
	    return num + 1;
	}

	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	public static int multiply(int num1, int num2) {
	    return num1 * num2;
	}

	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//	     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
	public static double multiply(double num1, double num2) {
	    return num1 * num2;
	}
	
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
	public static int[] generateRandomNumbers(int num) {
	    int[] arr = new int[num];
	    for (int i = 0; i < num; i++) {
	        arr[i] = (int)(Math.random() * 100) + 1;
	    }
	    return arr;
	}

	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
//	     配列の要素の平均値を返すメソッド（関数）を作成してください。
	public static double calculateAverage(int num) {
	    int[] randomNumbers = generateRandomNumbers(num);
	    int sum = 0;
	    for (int i = 0; i < randomNumbers.length; i++) {
	        sum += randomNumbers[i];
	    }
	    return (double)sum / randomNumbers.length;
	}

}
