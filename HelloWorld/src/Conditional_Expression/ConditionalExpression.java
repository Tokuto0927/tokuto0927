package Conditional_Expression;

public class ConditionalExpression {

	public static void main(String[] args) {
		boolean rain = true;
	    if (rain) {
	        System.out.println("DVDを見ます。");
	    } else {
	        System.out.println("外で遊びます。");
	    }
	

	
	
	    String name = "tokuto";
	    int score = (int)(Math.random() * 101);  
	    System.out.println(name + "さんは" + score + "点です。");
	    if (score <= 40) {
	    	System.out.println("もう少し頑張りましょう。");
	    } else if (score <= 60) {
	    	System.out.println("もう少しでした。");
	    } else if (score <= 80) {
	    	System.out.println("よくできました。");
	    } else {
	    	System.out.println("たいへんよくできました。");
	    }
	    
	    int isTired = 0;
	    String study = "カリキュラム";
	    if (isTired == 0) {
	        System.out.println("私はとても元気です。");
	        System.out.println(study + "を続けます。");
	    } else {
	        System.out.println("私は疲れています。");
	    }

	}
}
