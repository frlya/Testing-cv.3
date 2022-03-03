import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClculatorTest {
  Calculator c = new Calculator();

  @Test
  public void testSumSimple() {
    Assertions.assertEquals(c.add(2, 2), 4);
  }

  @Test
  public void testSumZero() {
    Assertions.assertEquals(c.add(0, 0), 0);
  }

  @Test
  public void testSumNegative() {
    Assertions.assertEquals(c.add(-1, -1), -2);
  }

  @Test
  public void testMultSimple() {
    Assertions.assertEquals(c.multiply(2, 2), 4);
  }

  @Test
  public void testSubSimple() {
    Assertions.assertEquals(c.substract(2, 2), 0);
  }

  @Test
  public void testDivSimple() {
    Assertions.assertEquals(c.divide(2, 2), 1);
  }

  @Test
  public void testDivException() {
    Assertions.assertThrows(Exception.class, () ->
        c.divide(1, 0)
    );
  }

  @Test
  public void testDivIntegerConvertion() {
    Assertions.assertEquals(c.divide(3, 4), 0);
  }
}
