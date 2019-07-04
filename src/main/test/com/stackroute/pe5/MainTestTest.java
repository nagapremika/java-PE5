package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;


public class MainTestTest {
    MainTest test;
    @Before
    public void setUp()
    {
        test=new MainTest();
    }
    @After
    public void tearDown()
    {
        test=null;
    }
    @Test
    public void givenStudetObjectsShouldReturnInOrder()
    {
        List<Student> list=new ArrayList<>();
       Student student1=new Student("12","premika","25");
       list.add(student1);
        Student student2=new Student("13","sahithi","22");
        list.add(student2);
        Student student3=new Student("14","Harika","22");
        list.add(student3);
        List<Student> result=test.sorter(list);
        List<Student> list1=new ArrayList<>();
        list1.add(student2);
        list1.add(student3);
        list1.add(student1);
        assertEquals(list1,result);
    }
    @Test
    public void givenStudetObjectsShouldReturnNotEquals()
    {
        List<Student> list=new ArrayList<>();
        Student student1=new Student("12","premika","25");
        list.add(student1);
        Student student2=new Student("13","sahithi","22");
        list.add(student2);
        Student student3=new Student("14","Harika","22");
        list.add(student3);
        List<Student> result=test.sorter(list);
        List<Student> list1=new ArrayList<>();
        list1.add(student2);
        list1.add(student3);
        list1.add(student2);
        assertNotEquals(list1,result);
    }
    @Test
    public void givenStudetObjectsWithSameNameShouldReturnNotEquals()
    {
        List<Student> list=new ArrayList<>();
        Student student1=new Student("12","premika","25");
        list.add(student1);
        Student student2=new Student("13","sahithi","22");
        list.add(student2);
        Student student3=new Student("14","sahithi","22");
        list.add(student3);
        List<Student> result=test.sorter(list);
        List<Student> list1=new ArrayList<>();
        list1.add(student2);
        list1.add(student3);
        list1.add(student1);
        assertEquals(list1,result);
    }
    @Test
    public void givenNullShouldReturnNull()
    {
        List<Student> list=null;

        List<Student> result=test.sorter(list);

        assertNull(result);
    }
}