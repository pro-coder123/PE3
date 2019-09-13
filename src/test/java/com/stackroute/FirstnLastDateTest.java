package com.stackroute;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class FirstnLastDateTest {

    private static FirstnLastDate object;

    @BeforeClass
    public static void setup()
    {
        object=new FirstnLastDate();
    }
    @AfterClass
    public static void teardown()
    {
        object=null;
    }
    @Test
    public static void TestFirstnlastDate()
    {
        assertEquals("Incorrect Logic","Mon 09/09/2019",object.ThrowFirstDate());
        assertEquals("Incorrect Logic","Sun  15/09/2019",object.ThrowLastDate());

    }
    @Test
    public static void TestFirstnlastDateFailure()
    {
        assertEquals("Incorrect Logic","11/09/2019",object.ThrowFirstDate());
        assertEquals("Incorrect Logic","18/09/2019",object.ThrowLastDate());

    }


}