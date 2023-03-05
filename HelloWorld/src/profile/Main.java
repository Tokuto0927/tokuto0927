package profile;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("稲垣徳人", 24, 1.79, 69.0);

        if (person1 != null) {
            System.out.println(person1.getName());
            System.out.println(person1.getAge() + "歳");
            System.out.println(person1.getHeight() + "m");
            System.out.println(person1.getWeight() + "kg");
        } else {
            System.out.println("person1はNULLです。");
        }
    }
}
