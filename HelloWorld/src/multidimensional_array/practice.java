package multidimensional_array;

public class practice {

	public static void main(String[] args) {
		int[][] test = {{64, 73, 69}, {58, 81, 75}, {86, 68, 79}, {72, 55, 80}};

		for (int i = 0; i < test.length; i++) {
		    System.out.println("生徒" + (i + 1) + "：" + "国語" + test[i][0] + "点、" + "数学" + test[i][1] + "点、" + "英語" + test[i][2] + "点");
		}
		
		int sumKokugo = 0;
		int sumMath = 0;
		int sumEng = 0;

		for (int i = 0; i < test.length; i++) {
		    sumKokugo += test[i][0];
		    sumMath += test[i][1];
		    sumEng += test[i][2];
		}

		double avgKokugo = (double)sumKokugo / test.length;
		double avgMath = (double)sumMath / test.length;
		double avgEng = (double)sumEng / test.length;

		System.out.println("国語の平均点は" + avgKokugo + "点です。");
		System.out.println("数学の平均点は" + avgMath + "点です。");
		System.out.println("英語の平均点は" + avgEng + "点です。");

	}

}
