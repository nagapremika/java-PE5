package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCounterTest {
    WordCounter word;
    @Before
    public void setUp()
    {
        word=new WordCounter();
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

        Map<String,Integer> result=word.counter("one one two five five five");
//        act
        Map<String,Integer> map=new HashMap<>();
        map.put("one",2);
        map.put("two",1);
        map.put("five",3);
        assertEquals(map,result);

    }
    @Test
    public void givenStringShouldReturnWordsCountNotEqual()
    {
//        arrange

        Map<String,Integer> result=word.counter("one one two five five five");
//        act
        Map<String,Integer> map=new HashMap<>();
        map.put("one",2);
        map.put("two",1);
        map.put("five",2);
        assertNotEquals(map,result);

    }
    @Test
    public void givenEmptyStringShouldReturnWordsCountZero()
    {
//        arrange

        Map<String,Integer> result=word.counter("");
//        act
        Map<String,Integer> map=new HashMap<>();
        map.put("size",0);

        assertEquals(map,result);

    }
    @Test
    public void givenNullStringShouldReturnNull()
    {
//        arrange

        Map<String,Integer> result=word.counter(null);
//        act

        assertNull(result);

    }

}