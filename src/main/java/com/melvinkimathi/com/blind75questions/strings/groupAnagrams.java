package com.melvinkimathi.com.blind75questions.strings;

import java.util.*;

public class groupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] tempArray = s.toCharArray();
            Arrays.sort(tempArray);
            String sortedString = new String(tempArray);

            //case 1 --> check to see if it exists in the hashmap
            if(map.containsKey(sortedString)) {
                map.get(sortedString).add(s);
            }
            //case 2 --> when it's not in the map
            else  {
                List<String> tempList = new ArrayList<>();
                tempList.add(s);
                map.put(sortedString, tempList);
            }
        }

        //map the map' values into a list
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.printf("Group anagrams: " + groupAnagrams(strs));
    }
}
