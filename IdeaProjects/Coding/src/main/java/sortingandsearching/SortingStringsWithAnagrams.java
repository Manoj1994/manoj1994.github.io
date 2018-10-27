package sortingandsearching;
import java.util.*;

public class SortingStringsWithAnagrams {


    public static void main(String[] args) {

        String[] strs = {"ab", "ba", "ac", "ca" ,"a", "b" ,"c", "cd", "dc" ,"ad" ,"da"};

        Arrays.sort(strs, new AnagramComparator());

        for(int i=0; i<strs.length; i++) {
            System.out.println(strs[i]);
        }

    }
}
