package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class StringFrequencyChecker {   //Finds Frequency of every word and gives true if frequency>=2 else false
    public Map<String,Boolean> frequency(String[] words)
    {
        int count=1;
        Map<String,Boolean> map=new HashMap<>();

         if(words==null){
            return  null;
        }
         else if(words.length==0)
        {
            map.put("Empty String",true);
        }
        else {
            for (int i = 0; i < words.length; i++) {            //Word count using for loop

                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count = count + 1;
                        words[j] = "";
                    }
                }
                if (words[i] != "" && count >= 2) {
                    map.put(words[i], true);
                } else if (words[i] != "") {
                    map.put(words[i], false);
                }

                count = 1;
            }
        }
        return map;
    }
}
