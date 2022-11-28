import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class TestListExamples {
  @Test
  public void mergeTest() {

    List<String> input1 = new ArrayList<>();
    input1.add("Apple");
    input1.add("Bat");
    input1.add("Firefighter");

    List<String> input2 = new ArrayList<>();
    input2.add("Cat");
    input2.add("Dog");
    input2.add("Elephant");

    List<String> expected = new ArrayList<>();
    expected.add("Apple");
    expected.add("Bat");
    expected.add("Cat");
    expected.add("Dog");
    expected.add("Elephant");
    expected.add("Firefighter");

    assertArrayEquals(expected.toArray(), (ListExamples.merge(input1, input2)).toArray());
  }

  @Test
  public void filterTest() {

    public class IsHello implements StringChecker() {
      public boolean checkString(String s) {
        return (s.contains("Hello"));
      }
    }

    List<String> input = new ArrayList<>();
    input.add("Hello");
    input.add("my");
    input.add("name");
    input.add("is");

    input1.add("Hello")




  }
}
