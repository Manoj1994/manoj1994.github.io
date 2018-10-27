package arraysandstrings;
import java.util.*;

public class RemoveDuplicates {

    public static String removeDuplicates(String s){

        int length = s.length();
        String output="";
        for(int i=0; i<length; i++) {
            int j=0;
            for(j=0; j<i; j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    break;
                }
            }

            if(j == i) {
                output+=s.charAt(i);
            }
        }
        return output;
    }

    public static String removeDuplicatesSort(String s){

        int length = s.length();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String output = "";
        int i=1;
        output += charArray[0];
        while(i < length) {
            if(charArray[i] != charArray[i-1]) {
                output += charArray[i];
            }
            i++;
        }
        return output;
    }

    public static String removeDuplicatesWithLinearSpace(String s) {

        Set<Character> set = new HashSet<>();
        String output =  "";
        int length = s.length();
        for(int i=0; i<length; i++) {
            char ch = s.charAt(i);
            if(!set.contains(ch)) {
                set.add(ch);
                output+=ch;
            }
        }
        return output;
    }

    public static String removeDuplicatesWithoutExtraSpace(String s) {


        return "";
    }

    public static void main(String [] args){
        System.out.println(removeDuplicates("manojmanish"));
        System.out.println(removeDuplicatesSort("manojmanish"));
        System.out.println(removeDuplicatesWithLinearSpace("manojmanish"));
    }
}
