import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooTests {

  private final Foo f = new Foo();

  @Test
  public void returnNumberIsFiveTrue() {
    Assertions.assertEquals(5, f.returnNumber());
    }

}
