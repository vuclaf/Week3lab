

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IntegerListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IntegerListTest
{
    /**
     * Default constructor for test class IntegerListTest
     */
    public IntegerListTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void FirstCase()
    {
        IntegerList testList1 = new IntegerList();
        testList1.append(3);
        testList1.append(4);
        testList1.append(5);
        testList1.append(7);
        testList1.append(8);
        assertEquals("34578", testList1.toString());
    }

    @Test
    public void SecondCase()
    {
        IntegerList testList2 = new IntegerList();
        testList2.append(023);
        assertEquals(false, testList2.isEmpty());
    }
}


