package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting sort;
    private TreeSet<String> list;

    @Before
    public void setUp()
    {
        sort=new Sorting();
    }
    @After
    public void tearDown()
    {
        sort=null;
    }
@Test
    public void givenSetShouldReturnSortedList()
{
    Set<String> set=new HashSet<>();
   set.add("banana");
    set.add("apple");
   set.add("grapes");
    List<String> result=sort.sortedList(set);
    List<String> list=new ArrayList<>();
    list.add("apple");
   list.add("banana");
   list.add("grapes");
    assertEquals(list,result);
}
    @Test
    public void givenSetShouldReturnSortedListFailure()
    {
        Set<String> set=new HashSet<>();
        set.add("banana");
        set.add("apple");
        set.add("grapes");
        List<String> result=sort.sortedList(set);
        List<String> list=new ArrayList<>();
        list.add("grapes");
        list.add("banana");
        list.add("apple");
        assertNotEquals(list,result);
    }
    @Test
    public void givenSetShouldReturnNull()
    {
        Set<String> set=null;
        List<String> result=sort.sortedList(set);
        List<String> list=new ArrayList<>();
        assertNull(result);
    }

    @Test
    public void givenSetShouldReturnSortedSet()
    {
        Set<String> set=new HashSet<>();
        set.add("zebra");
        set.add("elephant");
        set.add("whale");
        Set<String> result=sort.sortedSet(set);
       TreeSet<String> list=new TreeSet<>();
        list.add("elephant");
        list.add("whale");
        list.add("zebra");
        assertEquals(list,result);
    }
    @Test
    public void givenNullSetShouldReturnNull()
    {
        Set<String> set=null;
        Set<String> result=sort.sortedSet(set);
        assertNull(result);
    }

}