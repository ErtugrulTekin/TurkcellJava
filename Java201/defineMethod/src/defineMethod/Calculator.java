package defineMethod;

public class Calculator {

	public float topla(float x, float y) {
		return x + y;
	}

	public float cıkar(float x, float y) {
		return x - y;
	}
	
	public float carp(float x, float y) {
		return x * y;
	}
	
	public float bol(float x, float y) {
		return x / y;
	}
	
	public float kare(int x) {
		return (float)Math.pow(x, 2);
	}
	
	public float karekok(int x) {
		return (float)Math.sqrt(x);
	}
}
