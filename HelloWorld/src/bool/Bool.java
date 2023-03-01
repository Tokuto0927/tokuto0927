package bool;

public class Bool {

	public static void main(String[] args) {
		int a = 20;
	    int b = 5;
	    boolean result_1 = a >= b;
	    System.out.println("result_1の値：" + result_1);
	    
	    int c = 5;
	    int d = 10;
	    boolean result_2 = c != d;
	    System.out.println("result_2の値：" + result_2);
	    
	    int e = 12;
	    int f = 8;
	    boolean result_3 = e > 10 && f < 10;
	    System.out.println("result_3の値：" + result_3);
	    
	    int g = 7;
	    boolean result_4 = g <= 5 || g >= 10;
	    System.out.println("result_4の値：" + result_4);

	}

}
