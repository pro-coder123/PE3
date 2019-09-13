package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void check1()
    {
        Exceptions e = new Exceptions();
        assertEquals("NegativeArraySizeException",e.Negative());
    }
    @Test
    public void check2()
    {
        Exceptions e = new Exceptions();
        assertEquals("IndexOutOfBoundsException,",e.Index());
    }
    @Test
    public void check3()
    {
        Exceptions e = new Exceptions();
        assertEquals("NullPointerException.",e.Null());
    }

}