import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UnitTest{

  @Test
  void test1(){
    Person person = new Person("Gaetan");
    person.birthDate(15,9,1992);
    assertEquals(25, person.age());
  }
}
