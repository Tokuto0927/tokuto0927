package profile;
// Main.java
class Main {
    public static void main(String[] args) {
        Person person1 = new Person("稲垣徳人", 24, 1.79, 69.0);

        System.out.println(person1.name);
        System.out.println(person1.age+"歳");
        System.out.println(person1.height+"m");
        System.out.println(person1.weight+"kg");
    }
}


