package package1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {

    @Test
    public void IsTraCheck() throws Exception{
        Transpose check = new Transpose();
        String testcase2[] = check.tra("art cart bart");
        String answer2[] = {"tra","trac","trab"};
        assertArrayEquals(testcase2,answer2);
    }

}