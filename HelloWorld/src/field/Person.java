package field;

	public class Person {
		private String firstName;
		private String lastName;

		public Person(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String getFullName() {
			return firstName + " " + lastName;
		}

		public void buy(Car car) {
			car.setOwner(this.getFullName());
			System.out.println(this.getFullName() + "が購入しました。");
		}

		public void buy(Bicycle bicycle) {
			bicycle.setOwner(this.getFullName());
			System.out.println(this.getFullName() + "が購入しました。");
		}
	}
