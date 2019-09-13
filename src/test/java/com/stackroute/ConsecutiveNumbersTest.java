package com.stackroute;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

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
        ConsecutiveNumbers c = new ConsecutiveNumbers();
        assertTrue("Should be True,Incorrect Logic",c.checkconsecutive(new int[]{98,97,96,95,94}));
        assertFalse("Should be False,Incorrect Logic",c.checkconsecutive(new int[]{98,97,96,95,98,94}));
        assertFalse("Should be False,Incorrect Logic",c.checkconsecutive(new int[]{98,96,96,95,94}));
    }
    @Test
    public static void TestConsecutiveNumFailure()
    {
        assertNotNull("Should not return Null",c.checkconsecutive(new int[]{98,96,96,95,94}));
    }
}
