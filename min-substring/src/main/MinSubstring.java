package main;

import java.util.HashMap;

public class MinSubstring {

    public static String minSubstring(String string, String window){
        int p1 = 0, p2 = window.length()-1;
        int curMin = Integer.MAX_VALUE;
        int[] bestPs = {0, 0};
        while (p1 != p2){
            if(stringContainsWindow(string.substring(p1, p2), window)){
                if((p2-p1)+1 < curMin){ curMin = (p2-p1)+1; bestPs[0]=p1; bestPs[1]=p2;}
                ++p1;
            }else {
                ++p2;
                if (p2 >= string.length() - 1) {
                    p2 = string.length() - 1;
                    ++p1;
                }
            }
        }
        return string.substring(bestPs[0], bestPs[1]);
    }

    public static boolean stringContainsWindow(String string, String window){
        HashMap<Character, Integer> charWindow = new HashMap<>();
        for(char c : window.toCharArray()){
            if(charWindow.containsKey(c)) charWindow.replace(c, charWindow.get(c)+1);
            else charWindow.put(c, 1);
        }

        for(char c : string.toCharArray()){
            if(charWindow.containsKey(c)){
                int value = charWindow.get(c);
                --value;
                if(value <= 0)charWindow.remove(c);
                else charWindow.replace(c, value);
            }
        }
        return charWindow.isEmpty();
    }

}
