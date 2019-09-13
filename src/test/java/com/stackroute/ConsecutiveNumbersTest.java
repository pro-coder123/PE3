package com.stackroute;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConsecutiveNumbersTest {
    private static ConsecutiveNumbers object ;
    @BeforeClass
    public static void setup()
    {object=new ConsecutiveNumbers();
    }
    @AfterClass
    public static void teardown()
    {
        object=null;
    }
    @Test
    public static void TestConsecutiveNum()
    {

        assertEquals("Should be True,Incorrect Logic",true,"98,97,96,95,94");
        assertEquals("Should be False,Incorrect Logic",false,"98,97,96,95,98,94");
        assertEquals("Should be False,Incorrect Logic",false,"98,96,96,95,94");

    }
    @Test
    public static void TestConsecutiveNumFailure()
    {

        assertNotEquals("Incorrect Logic",false,"98,97,96,95,94");
        assertNotEquals("Incorrect Logic",true,"98,97,96,95,98,94");
        assertNotEquals("Incorrect Logic",true,"98,96,96,95,94");
        assertNotNull("Should not return Null","98,96,96,95,94");

    }
}
