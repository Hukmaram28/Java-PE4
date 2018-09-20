package package1;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabeticalOrderTest {

    @Test
    public void IsAlCheck() throws Exception{
        AlphabeticalOrder check = new AlphabeticalOrder();
        String testcase2[] = check.ord("art cart bart");
        String answer2[] = {"art","bart","cart"};
        assertArrayEquals(testcase2,answer2);
    }
}