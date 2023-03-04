package field;

		public class Main {
			public static void main(String[] args) {
				Person person1 = new Person("鈴木", "太郎");
				Person person2 = new Person("山田", "花子");

				Car car = new Car();
				Bicycle bicycle = new Bicycle();

				car.setOwner(person1.getFullName());
				bicycle.setOwner(person2.getFullName());


				person1.buy(car); 
				person2.buy(bicycle); 
			}
		}
