package ua.myjavastudy.lesson2.task2.test;



import junit.framework.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import ua.myjavastudy.lesson2.task2.Calculation.Arithmetics;


public class ArithmeticsTest {
    private static Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);


    @Before
    public void runT(){
        a = new Arithmetics();
    }
    /*
        @After
        @AfterAll
    * */
    @Ignore
    @Test
    public void testAdd () {
        double res = a.add(3, 7);
        Assert.assertEquals(res, 10.0, res - 10.0 );

    }

    @Test
    public void testMult () {
        double res = a.mult(7,3);
        Assert.assertEquals(res, 21.0, res - 21.0);
    }

    @Test
    public void testDeduct () {
        double res = a.deduct(3, 7);
        Assert.assertEquals(res, -4.0, res - (-4.0));
    }

    @Test
    public void testDiv () {
        double res = a.div(10, 5);
        Assert.assertEquals(res, 2.0, res - 2.0);
    }

    //@Test (expected = ArithmeticException.class)
    @Test
    public void testDivException(){
        exp.expect(ArithmeticException.class);
        a.div(10.0 , 0);
    }

    @Test
    public void testN() {
        a.div(10.0 , 10);
    }
}