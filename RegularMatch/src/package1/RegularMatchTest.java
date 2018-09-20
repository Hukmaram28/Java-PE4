package package1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularMatchTest {

    @Test
    public void IsRegCheck() throws Exception{
        RegularMatch check = new RegularMatch();
        boolean testcase2 = check.reg("Harry is nice");
        boolean answer2 = true;
        Assert.assertEquals(testcase2,answer2);
    }
}