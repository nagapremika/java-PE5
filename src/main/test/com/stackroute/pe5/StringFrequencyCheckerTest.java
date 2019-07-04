package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringFrequencyCheckerTest {
    StringFrequencyChecker word;
    @Before
    public void setUp()
    {
        word=new StringFrequencyChecker();
    }
    @After
    public void tearDown()

    {
        word=null;
    }
    @Test
    public void givenStringShouldReturnWordsCount()
    {
//        arrange

        Map<String,Boolean> result=word.frequency(new String[] {"a","a","a","b","c","b"});
//        act
        Map<String, Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",true);
        map.put("c",false);
        assertEquals(map,result);

    }
    @Test
    public void givenStringShouldReturnWordsCountNotCorrect()
    {
//        arrange

        Map<String,Boolean> result=word.frequency(new String[] {"a","a","a","b","c","b"});
//        act
        Map<String, Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",false);
        assertNotEquals(map,result);

    }
    @Test
    public void givenEmptyStringShouldreturnEmpty()
    {
//        arrange

        Map<String,Boolean> result=word.frequency(new String[]{});
//        act
        Map<String,Boolean> map=new HashMap<>();
        map.put("Empty String",true);

        assertEquals(map,result);

    }
    @Test
    public void givenNullStringShouldReturnNull()
    {
//        arrange

        Map<String,Boolean> result=word.frequency(null);
//        act

        assertNull(result);

    }
}