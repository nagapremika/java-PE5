package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ValueChangerTest {
   ValueChanger value;
    @Before
    public void setUp()
    {
        value=new ValueChanger();
    }
    @After
    public void tearDown()
    {
        value=null;
    }
    @Test
    public void givenMapShouldReturnUpdated()
    {
        Map<String,String> map1=new HashMap<>();
        map1.put("key1","value1");
        map1.put("key2","value2");
        Map<String,String> result=value.changer(map1);
        Map<String,String> map2=new HashMap<>();
        map2.put("key1","");
        map2.put(" key2","value1");
        assertEquals(map2,result);
    }
    @Test
    public void givenMapShouldReturnMapUpdated()
    {
        Map<String,String> map1=new HashMap<>();
        map1.put("key1","value1");
        map1.put("key2","value2");
        Map<String,String> result=value.changer(map1);
        Map<String,String> map2=new HashMap<>();
        map2.put("key1","");
        map2.put("key1","value1");
        assertNotEquals(map2,result);
    }
    @Test
    public void givenNullShouldReturnNull()
    {
        Map<String,String> map1=null;

        Map<String,String> result=value.changer(map1);

        assertNull(result);
    }

}