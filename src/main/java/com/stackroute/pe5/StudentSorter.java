package com.stackroute.pe5;

import java.util.Comparator;


    public class StudentSorter implements Comparator<Student>   //Implements Comparator
    {
public int compare(Student student1,Student student2)   //Overrides compare() method
{
    int difference=0;
    int ageDifference=student1.getAge().compareTo(student2.getAge());
    int nameDifference=student1.getName().compareTo(student2.getAge());
    int idDifference=student1.getId().compareTo(student2.getAge());

    if(ageDifference==0)
    {
        if(nameDifference==0)
        {
            difference=idDifference;
        }
    }
    else{
        difference=ageDifference;       //difference to sort the students
    }
    return difference;
}
    }


