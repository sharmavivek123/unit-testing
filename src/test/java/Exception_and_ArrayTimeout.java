import org.junit.*;

        import java.util.Arrays;
        import static org.junit.Assert.*;

public class Exception_and_ArrayTimeout{

    @Test
    public void testArray(){
        int a[]={34,56,3,6};
        int expect[]={3,6,34,56};
        Arrays.sort(a);
        assertArrayEquals(expect,a);

    }

    @Test(expected = NullPointerException.class)
    public void testException(){
        int a[]=null;
        Arrays.sort(a);

    }

    @Test(timeout = 100)
    public void testTimeoutMehod(){
        int a[]={22,45,67};
        for (int k=0;k<1000000;k++){
            a[0]=k;
            Arrays.sort(a);
        }
    }


}