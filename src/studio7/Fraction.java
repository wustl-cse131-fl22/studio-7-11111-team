package studio7;

public class Fraction {
	private int num, denom;

	public Fraction(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}
	
	public Fraction add(Fraction later) {
		int NEWmerator = this.num*later.denom+later.num*this.denom;
		int deNEWmerator = this.denom*later.denom;
		Fraction new_fraction = new Fraction(NEWmerator,deNEWmerator);
		
		return new_fraction;
	}
	
	public Fraction multiply(Fraction later) {
		int NEWmerator = this.num * later.num;
		int deNEWmerator = this.denom*later.denom;
		Fraction new_fraction = new Fraction(NEWmerator,deNEWmerator);
		
		return new_fraction;
	}
	
	public Fraction recip() {
		int NEWmerator = this.denom;
		int deNEWmerator = this.num;
		Fraction new_fraction = new Fraction(NEWmerator,deNEWmerator);
		
		return new_fraction;
	}
	
	public static int gcd(int p, int q) {
		if(p%q == 0) {
			return q;
		}
		else {
			return gcd(q,p%q);
		}		
	}
	
	public Fraction simple() {
		int yellow = gcd(this.num,this.denom);
		Fraction new_fraction = new Fraction (this.num/yellow,this.denom/yellow);
		return new_fraction;
	}

	@Override
	public String toString() {
		return  num + "/"+ denom;
	}


}
