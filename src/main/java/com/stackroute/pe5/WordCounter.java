package com.stackroute.pe5;

import java.util.HashMap;

import java.util.Map;

public class WordCounter {      //Cont Frequency of every word in string and returns result using map
    public Map<String,Integer> counter(String string)
    {
        int count=1;
        Map<String,Integer> map=new HashMap<>();
        if(string=="")
        {
            map.put("size",0);
        }
        else if(string==null){
            return  null;
        }
        else {
            String[] words = string.split(" ");
            for (int i = 0; i < words.length; i++) {            //Word count using for loop

                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count = count + 1;
                        words[j] = "";
                    }
                }
                if (words[i] != "") {
                    map.put(words[i], count);
                }
                count = 1;
            }
        }
        return map;
    }
}
