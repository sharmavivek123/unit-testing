import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


@RunWith(Parameterized.class)
public class ParameterizedTest {

    Helper helper = new Helper();


    String input;
    String expectedOutput;

    public ParameterizedTest( String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testCondition(){
        String expectedOutput[][]={{"AABC","BC"},{"ABCB","CB"}};
      return  Arrays.asList(expectedOutput);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        Assert.assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }




}
