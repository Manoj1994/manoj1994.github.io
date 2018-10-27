package arraysandstrings;

import java.util.HashMap;

public class Anagrams {

    public static boolean anagramsSort(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();

        if(length1 != length2) {
            return false;
        }

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        for(int i=0; i<length1; i++) {
            if(charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean anagramLinearSpace(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        int length1 = s1.length();
        int length2 = s2.length();

        if(length1 != length2) {
            return false;
        }
        for(int i=0;i<length1;i++) {
            char ch = s1.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        for(int i=0;i<length2;i++) {
            char ch = s2.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)-1);
            } else {
                return false;
            }
        }

        for(int i : map.values()) {
            if(i!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(anagramLinearSpace("manoj", "jonam"));
        System.out.println(anagramsSort("manoj", "jonam"));
    }
}
