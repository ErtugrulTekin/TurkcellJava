package static_Methods;

public class Calculator {

	public static float topla(float x, float y) {
		return x + y;
	}

	public static float cıkar(float x, float y) {
		return x - y;
	}
	
	public static float carp(float x, float y) {
		return x * y;
	}
	
	public static float bol(float x, float y) {
		return x / y;
	}
	
	public static float kare(int x) {
		return (float)Math.pow(x, 2);
	}
	
	public static float karekok(int x) {
		return (float)Math.sqrt(x);
	}
}
