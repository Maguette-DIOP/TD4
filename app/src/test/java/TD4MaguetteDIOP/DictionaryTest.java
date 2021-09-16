package TD4MaguetteDIOP;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import java.util.ArrayList;
import java.util.List;
public class DictionaryTest {
//Il faut competer
    private Dictionary dict;
    @Before public void initialize(){
        dict = new Dictionary("Example");
        List<String> trans_contre = new ArrayList<>();
        trans_contre.add("against");
        trans_contre.add("against2");
        trans_contre.add("against3");

        dict.addtranslation_key("contre",  trans_contre);

    }
    
    @Test public void Isempty(){
        assertNotNull("on ne peut pas traduire",dict.getTranslation("contre"));
    }
    @Test public void testDictionaryName(){
        System.out.println(dict.getName());
        assertThat(dict.getName(),equalTo("Example"));
    }
   @Test public void testTraduction(){
    List<String> trans_contre = new ArrayList<>();
    trans_contre.add("against");
    trans_contre.add("against2");
    trans_contre.add("against3");
        assertThat(dict.getTranslation("contre"),equalTo(trans_contre));
    }
    @Test public void testInverse(){
        assertThat(dict.getInverse("against2"),equalTo("contre"));
    }
    
}