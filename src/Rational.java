public class Rational {

    private int num;
    private int denom;

    public Rational() {
	this.num = 1;
	this.denom = 1;
    }

    public Rational(int num, int denom) {
	this.num = num;
	this.denom = denom;
    }

    @Override
    public String toString() {
	return num + "/" + denom;
    }

    public static void main (String [] args) {
	Rational r = new Rational(5,7);
	System.out.println("r.getNumerator()=" + r.getNumerator());
	System.out.println("r.getNumerator()=" + r.getDenominator());
    }

    public int getNumerator() { return this.num;}
    public int getDenominator() {return this.denom;}
	
	/**
		greatest common divisor of a and b
		@param a first number
		@param b second number
		@return gcd of a and b
	*/
	public static int gcd(int a, int b) {
		return -42;
	}
}
