package package1;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceThisTest {

    @Test
    public void IsRepCheck() throws Exception{
        ReplaceThis check = new ReplaceThis();
        String testcase2 = check.rep("daily");
        String answer2 = "faity";
        Assert.assertEquals(testcase2,answer2);
    }
}