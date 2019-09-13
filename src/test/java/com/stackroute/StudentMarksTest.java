package com.stackroute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentMarksTest {

    private static StudentMarks object;

    @BeforeClass
    public static void setup() {
        object = new StudentMarks();
    }

    @AfterClass
    public static void teardown()
    {
        object=null;
    }

   @Test
    public void TestStudentMarks()
   {
      assertEquals( "All the grades are below 100.Should return boolean true  "  ,true,object.gradecheck(new int[]{60,70,80,90,100},5));
      assertEquals( "There are few Grades exceeding 100.Check your code"  ,false,object.gradecheck(new int[]{60,70,80,90,100,120,125,140},8));
   // assertNotEquals("Initially check whether n.o of students and n.o of Grades are equal,if not return false",true,object.gradecheck(new int[]{120,150,40,50,60},4));

   }



}
