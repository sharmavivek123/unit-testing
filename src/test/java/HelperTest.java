import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelperTest {
    Helper helper = new Helper();


    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals("BC", helper.truncateAInFirst2Positions("AABC"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame() {
        boolean abab = helper.areFirstAndLastTwoCharactersTheSame("ABAB");
        assertTrue(abab);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_2() {
        boolean abab = helper.areFirstAndLastTwoCharactersTheSame("A");
        assertFalse(abab);
    }


}

