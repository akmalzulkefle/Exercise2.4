public class Main {

	public static void main(String[] args) {
		
		Shimano s = new Shimano();
		
		s.setModel("Mountain Bike");
		s.setColour("Black-Green");
		s.setSpeed(16);
		s.setWeight(12.71);
		
		System.out.println("Model : " + s.getModel());
		System.out.println("Colour : " + s.getColour());
		System.out.println("Speed : " + s.getSpeed() + " KM/H ");
		System.out.println("Weight : " + s.getWeight() + " KG ");
		s.fullAccelarate();
		
	}

}
