package field;

public class Vehicle {

	private String owner;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		if(owner != null) {
			this.owner = owner;
		} else {
			throw new IllegalArgumentException("Owner cannot be null.");
		}
	}

	
	

}
