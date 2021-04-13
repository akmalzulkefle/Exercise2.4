
public class Shimano {

	String model;
	String colour;
	int maxspeed;
	double weight;
	
	
	//create Setter Method
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setSpeed(int maxSpeed) {
		this.maxspeed = maxSpeed;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//create Getter Method
	public String getModel() {
		return this.model;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public Integer getSpeed() {
		return this.maxspeed;
	}
	
	public Double getWeight() {
		return this.weight;
	}
	
	// Create a fullAccelarate() method
		public void fullAccelarate() {
			System.out.println("The bike is going as fast as it can!");
		}
}
