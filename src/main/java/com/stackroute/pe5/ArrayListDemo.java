package com.stackroute.pe5;


import java.util.List;

public class ArrayListDemo {    //Updates the list
    public List<String> update(List<String> strings,String word)
    {
if(strings==null)
{
    return null;
}
else {
    strings.remove(0);
    strings.add(0, word);        //Adds word to first index of list
//        strings.clear();
}
        return strings;

    }
}
