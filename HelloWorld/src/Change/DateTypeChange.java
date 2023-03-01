package Change;

public class DateTypeChange {

	public static void main(String[] args) {
		int i = 3;
	    double d = i;
	    System.out.println("iの値：" + i);
	    System.out.println("dの値：" + d);
	    
	    double pi = 3.14;
	    System.out.println("pi * 3 = " + (pi * 3));
	    int integer = (int)pi;
	    System.out.println("integerの値：" + integer);
	    
	    double doubleNum = 2 + 6.0;
	    System.out.println("doubleNumの値：" + doubleNum);
	    int intNum = (int)doubleNum;
	    System.out.println("intNumの値：" + intNum);
	    String str = Integer.toString(intNum);
	    System.out.println("strの値：" + str);
	    intNum = Integer.parseInt(str);
	    System.out.println("intNumの値：" + intNum);
	}

}
