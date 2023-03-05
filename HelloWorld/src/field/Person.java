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
			if(car != null) {
				car.setOwner(this.getFullName());
				System.out.println(this.getFullName() + "が購入しました。");
			} else {
				throw new IllegalArgumentException("Car cannot be null.");
			}
		}

		public void buy(Bicycle bicycle) {
			if(bicycle != null) {
				bicycle.setOwner(this.getFullName());
				System.out.println(this.getFullName() + "が購入しました。");
			} else {
				throw new IllegalArgumentException("Bicycle cannot be null.");
			}
		}

	}
