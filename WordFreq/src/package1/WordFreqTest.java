package package1;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordFreqTest {

    @Test
    public void IsFreqCheck() throws Exception{
        WordFreq check = new WordFreq();
        int testcase2 = check.freq("Java");
        int answer2 = 2;
        Assert.assertEquals(testcase2,answer2);
    }
}