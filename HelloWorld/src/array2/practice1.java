package array2;
	/*
	string型の配列を作成し、アルファベットa～jまでを格納してください。
	brake文を使用し、a～dまで表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	          
	cotinue文を使用し、i以外を表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	           e
	           f
	           g
	           h
	           j
	*/



public class practice1 {

	public class Main {
	    public static void main(String[] args) {
	        // アルファベットa～jまでを格納したString型の配列を作成
	        String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

	        // brake文を使用してa～dまで表示
	        for (int i = 0; i <5; i++) {
	            if (alphabets[i].equals("e")) {
	                break;
	            }
	            System.out.println(alphabets[i]);
	        }

	        // cotinue文を使用して i以外を表示
	        for (int i = 0; i < 10; i++) {
	            if (alphabets[i].equals("i")) {
	                continue;
	            }
	            System.out.println(alphabets[i]);
	        }
	    }
	}


}
