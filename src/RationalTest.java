import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RationalTest {
  @Test
      public void test_getNumerator_1() {
      Rational r=new Rational(4,5);
      assertEquals(4, r.getNumerator());   
  }
  
  @Test
      public void test_getNumerator_2() {
      Rational r=new Rational(7,3);
      assertEquals(7, r.getNumerator());   
  }
  
  @Test
      public void test_getDenominator_1() {
      Rational r=new Rational(4,5);
      assertEquals(5, r.getDenominator());   
  }
  
  @Test
      public void test_getDenominator_2() {
      Rational r=new Rational(7,3);
      assertEquals(3, r.getDenominator());   
  }
  
  @Test
    public void test_gcd_5_15() {
	assertEquals(5, Rational.gcd(5,15));
  }

  @Test
    public void test_gcd_15_5() {
	assertEquals(5, Rational.gcd(15,5));
  }

  @Test
    public void test_gcd_24_6() {
	assertEquals(6, Rational.gcd(24,6));
  }

  @Test
    public void test_gcd_17_5() {
	assertEquals(1, Rational.gcd(17,5));
  }
    
  @Test
    public void test_gcd_1_1() {
	assertEquals(1, Rational.gcd(1,1));
  }

  @Test
    public void test_gcd_20_25() {
	assertEquals(5, Rational.gcd(20,25));
  }
}