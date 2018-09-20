package package1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchSeTest {

    @Test
    public void IsRegCheck() throws Exception{
        MatchSe check = new MatchSe();
        String testcase2 = check.reg("She sells seashells by the seashore");
        String answer2 = "Found at: 4 - 6Found at: 10 - 12Found at: 27 - 29";
        Assert.assertEquals(testcase2,answer2);
    }


}