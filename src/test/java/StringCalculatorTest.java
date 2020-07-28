import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringCalculatorTest {

     @Test
     public void emptyString() {
         assertThat(StringCalculator.add(""), is(0));
     }
     @Test
     public void  multipleIntegers() {
         assertThat(StringCalculator.add("1,2,3,4"), is(10));
     }
     @Test
     public void  handleNewLinesBetweenIntegers() {
         assertThat(StringCalculator.add("1,2\n1"), is(4));
     }
     @Test
     public void handleNegativeValues() {
         try {
             assertThat(StringCalculator.add("-1,-2,-3"), is(-6));
         } catch (NumberFormatException e) {
             e.printStackTrace();
         }
     }
     @Test
     public void  handleNumbersGreaterThanThousand() {
         try {
             assertThat(StringCalculator.add("//;\n1000;1;4"), is(5));
         } catch (NumberFormatException e){
             e.getMessage();
         }
     }
}
