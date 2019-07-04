package com.stackroute.pe5;

import java.util.*;

public class ValueChanger {     //Changes the value of key1 to emptystring and key2 to value of key1
   public Map<String,String> changer(Map<String,String> result)
    {
        if(result==null){
            result=null;
        }
        else {
            String[] keys = new String[2];
            String[] values = new String[2];
            String[] string = new String[2];
            Set<String> key = result.keySet();      //set contains keys of map
            String input = key.toString();

            input = input.substring(1, input.length() - 1);
            keys = input.split(",");

            for (int i = 0; i < 2; i++) {
                values[i] = result.get(keys[i]);        //values of keys in String[] values

            }

            result.clear();
            result.put(keys[0], "");
            result.put(keys[1], values[0]);
        }
      return result;
    }
}
