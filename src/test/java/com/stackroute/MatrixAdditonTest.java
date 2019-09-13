package com.stackroute;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class MatrixAdditonTest {

    private static MatrixAddition object;

    @BeforeClass
    public static void setup()
    {
        object=new MatrixAddition();
    }
    @AfterClass
    public static void teardown()
    {
        object=null;
    }
    @Test
    public static void TestMatrixAddition()
    {
        assertEquals("Incorrect Logic", new int[][]{{2,4,6},{8,10,12}},object.Matrixadditionresult(new int[][]{{1,2,3},{4,5,6}},new int[][]{{1,2,3},{4,5,6}}));
        assertEquals("Incorrect Logic", new int[][]{{12,14,16},{18,10,12}},object.Matrixadditionresult(new int[][]{{6,7,8},{9,5,6}},new int[][]{{6,7,8},{9,5,6}}));

    }
    @Test
    public static void TestMatrixAdditionFailure()
    {
        assertNotEquals("Incorrect Logic", new int[][]{{12,41,6},{18,10,12}},object.Matrixadditionresult(new int[][]{{1,2,3},{4,5,6}},new int[][]{{1,2,3},{4,5,6}}));
        assertNotEquals("Incorrect Logic", new int[][]{{112,114,16},{181,10,12}},object.Matrixadditionresult(new int[][]{{6,7,8},{9,5,6}},new int[][]{{6,7,8},{9,5,6}}));

    }
}
