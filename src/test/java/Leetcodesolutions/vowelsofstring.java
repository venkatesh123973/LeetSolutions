package Leetcodesolutions;

import java.util.HashMap;
import java.util.Map;

public class vowelsofstring {

    public static void reversevowels(String vowel){
        String input=vowel.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);

        for(char ch:input.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
        }

        for(Map.Entry<Character,Integer>val:map.entrySet()){

            System.out.println(val.getKey() +" " + val.getValue());
        }

    }

    public static void main(String[] args){
        String vowel = "Hello";
        reversevowels(vowel);
    }
}
