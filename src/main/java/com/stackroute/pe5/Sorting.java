package com.stackroute.pe5;

import java.util.*;

public class Sorting {
    public List<String> sortedList(Set<String> set) //Sorts the set in list
    {
        if(set==null)
        {
            return null;
        }
        List<String> list =new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }

    public Set<String> sortedSet(Set<String> set)   //Sorts the set within set
    {
        if(set==null)
        {
            return null;
        }
        TreeSet<String> tree=new TreeSet<>(set);

        return tree;
    }
}
