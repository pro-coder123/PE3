package com.stackroute;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RemoveVowelTest {
    public static RemoveVowel object;

    @BeforeClass
    public static void setup()
    {
        object=new RemoveVowel();
    }
    @AfterClass
    public static void teardown()
    {
        object=null;
    }
    @Test
    public static void TestRemoveVowel()
    {
        assertNotEquals("incorrect logic",new String[]{"Ind","Untd stts","Grmy","Egypt","czchslvk"},object.vowelremove(new String[]{"India","United states","Germany","Egypt","czechoslovakia"}));
        assertNotEquals("incorrect logic",new String[]{"Hke","Whtspp","Fcbk"},object.vowelremove(new String[]{"Hike","Whatsapp","Facebook"}));
    }
    @Test
    public static void TestRemoveVowelFailure()
    {
        assertNotEquals("incorrect logic",new String[]{"Indi","Unted stts","Gremy","Egfypt","czcghslvk"},object.vowelremove(new String[]{"India","United states","Germany","Egypt","czechoslovakia"}));
        assertNotEquals("incorrect logic",new String[]{"Hike","Whatspp","Facbk"},object.vowelremove(new String[]{"Hike","Whatsapp","Facebook"}));
        assertNotNull("incorrect Logic.Should return a string array",object.vowelremove(new String[]{"India","United states","Germany","Egypt","czechoslovakia"}));
    }

}
