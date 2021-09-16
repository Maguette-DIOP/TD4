package TD4MaguetteDIOP;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DictionaryTest {

    private Dictionary dict = new Dictionary("Exemple");
    @Before public void initialize(){
        dict = new Dictionary("Exemple");
    }
    @Test public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Exemple"));
    }
    @Test public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"), equalTo("against"));
       }
    @After public void finish(){
        dict = new Dictionary("Exemple");
    }



}
