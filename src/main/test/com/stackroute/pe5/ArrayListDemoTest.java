package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListDemoTest {
    ArrayListDemo demo;

    @Before
    public void setUp() {
        demo = new ArrayListDemo();
    }

    @After
    public void tearDown() {
        demo = null;
    }

    @Test
    public void givenListAndStringShouldReturnUpdatedList() {
//        arrange
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        List<String> result = demo.update(list, "Kiwi");
//        act
        List<String> list2 = new ArrayList<>();
        list2.add("Kiwi");
        list2.add("Grape");
        list2.add("Melon");
        list2.add("Berry");
        assertEquals(list2, result);

    }

    @Test
    public void givenListShouldReturnUpdatedList() {
//        arrange
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        List<String> result = demo.update(list, "Kiwi");
//        act
        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Grape");
        list2.add("Kiwi");
        list2.add("Berry");

        assertNotEquals(list2, result);


    }

    @Test
    public void givenNullListShouldReturnNull() {
//        arrange
        List<String> list = null;
        List<String> result = demo.update(list, "");
        assertNull(result);
    }
}