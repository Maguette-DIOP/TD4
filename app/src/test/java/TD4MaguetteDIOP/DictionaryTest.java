package TD4MaguetteDIOP;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class DictionaryTest {
    private Dictionary dict = new Dictionary("Exemple");
    @Test public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
        }
}
