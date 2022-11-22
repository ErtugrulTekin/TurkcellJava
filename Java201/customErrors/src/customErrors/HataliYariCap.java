package customErrors;

public class HataliYariCap extends RuntimeException{

	private double yaricap;
	
	public HataliYariCap(double yaricap) {
		super("Yaricap " + yaricap + " olamaz!");
	}
}
