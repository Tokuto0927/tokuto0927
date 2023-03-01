package array2;

public class practice {

	public static void main(String[] args) {
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		for (int i = 0; i < alphabet.length; i++) {
	        if (alphabet[i].equals("i")) {
	            continue;
	        }
	        System.out.println(alphabet[i]);
	    }

	}

}
