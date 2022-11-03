package studio7;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Die testing = new Die(10);
		System.out.println(testing.roll());
		
		Rectangle thing = new Rectangle(5,9);
		System.out.println(thing.getArea());
		
		Fraction slamma = new Fraction(4,12);
		System.out.println(slamma.simple());
	}

}
