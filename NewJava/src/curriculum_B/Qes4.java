package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
	        int rows = 9;
	        int columns = 9;

	        // 表の要素を格納する2次元配列を作成
	        String[][] table = new String[rows][columns];

	        // 表を作成して要素を埋める
	        for (int j = 0; j < columns; j++) {
	            for (int i = 0; i < rows; i++)  {
	                int result = (i + 1) * (j + 1);
	                table[i][j] = String.format("%03d * %03d = %03d", (i + 1) , (j + 1), result);
	            }
	        }

	        // 表の内容を表示
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(table[i][j]);
	                if (j != columns - 1) {
	                    System.out.print(" || ");
	                }
	            }
	            System.out.println();
	        }
	 }
}
