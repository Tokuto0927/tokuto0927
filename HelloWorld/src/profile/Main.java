package profile;

public class Main {
    public static void main(String[] args) {
    	
    	
    	//問題5：Main.javaの引数にweightの60を入れてください
        Person person1 = new Person("稲垣徳人", 24, 1.79, 60.0);

        if (person1 != null) {
            System.out.println(person1.getName());
            System.out.println(person1.getAge() + "歳");
            System.out.println(person1.getHeight() + "m");
            System.out.println(person1.getWeight() + "kg");
            person1.print();
        } else {
            System.out.println("person1はNULLです。");
        }
    }
}
	