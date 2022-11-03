package studio7;

public class Complex {
	private double a, b;

	public Complex(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	public Complex add(Complex other_complex) {
		double add_a = this.a + other_complex.a;
		double add_b = this.b + other_complex.b;
		
		Complex new_complex = new Complex(add_a,add_b);
		return new_complex;
	}
	
	public Complex multiply() {
		
	}
	

}
