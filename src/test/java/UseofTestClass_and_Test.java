import com.sun.tools.corba.se.idl.toJavaPortable.Helper;
import org.junit.*;

        import static org.junit.Assert.*;

public class UseofTestClass_and_Test {
    Helper helper = new Helper();


    @BeforeClass
    public static  void beforeClass(){
        System.out.println("before class****************");
    }

    @Before
    public void beforeTest(){
        System.out.println("before test it runs");
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        System.out.println(" test case 1 executed");
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame(){
        System.out.println(" test case 2 executed");
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_2(){

        System.out.println(" test case 3 executed");

    }


    @After
    public void aftertest(){
        System.out.println("after test case");
    }


    @AfterClass
    public static  void afterClass(){
        System.out.println("after class****************");
    }
}