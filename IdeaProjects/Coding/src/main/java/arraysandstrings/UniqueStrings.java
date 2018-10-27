package arraysandstrings;

import java.util.Arrays;

public class UniqueStrings {

    final static int TOTAL_CHARS = 256;

    public static boolean uniqueStringBruteForce(String s) {

        int length = s.length();
        for(int i=0;i<length;i++) {
            for (int j = i + 1; j < length; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean uniqueStringsSort(String s) {

        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        for(int i=0;i<charArray.length-1;i++) {
            if(charArray[i] == charArray[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean uniqueStringsUsingLognSpace(String s) {

        boolean chars[] = new boolean[TOTAL_CHARS];
        int length = s.length();
        for(int i=0; i<length; i++) {
            int key = s.charAt(i);
            if(!chars[key]) {
                chars[key] = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean uniqueStringsWithOutExtraSoace(String s) {

        int charCheck = 0;
        int length = s.length();
        for(int i=0;i<length;i++) {
            int key = s.charAt(i);
            if((charCheck & (1 << key)) > 0) {
                return false;
            }
            charCheck = charCheck | (1 << key);
        }
        return true;
    }

    public static void main(String args[]) {
        String s = "manojbc";
        System.out.println(uniqueStringBruteForce(s));
        System.out.println(uniqueStringBruteForce(s));
        System.out.println(uniqueStringsUsingLognSpace(s));
        System.out.println(uniqueStringsWithOutExtraSoace(s));
    }
}
