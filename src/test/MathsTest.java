package test;

import main.Maths;
import org.junit.*;
public class MathsTest {
    Maths maths;
    @Before
    public void setupinstance(){
        maths = new Maths();
    }

    @Test
    public void  checkTheSumofTwoNumbersEqualsThree(){
        Assert.assertEquals(3, maths.addTwoNumbers(9, 2));
    }
    @Test
    public void  checkTheSumofTwoNumbersEqualsThreeAgain(){
        Assert.assertEquals(3, maths.addTwoNumbers(1, 2));
    }

    @Test
    public void  checkifnumberisprime(){
        Assert.assertTrue(maths.checkprime(3));
    }






}
