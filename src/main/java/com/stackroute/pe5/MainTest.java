package com.stackroute.pe5;


import java.util.Collections;
import java.util.List;

public class MainTest {
    StudentSorter studentsorter=new StudentSorter();      //  creates object for StudentSorter
    public List<Student> sorter(List<Student> studentList) {
if(studentList!=null)
{
    Collections.sort(studentList,new StudentSorter());      //sort() method with studentList to sort
}

else {
    studentList=null;
}

return studentList;
    }
}


