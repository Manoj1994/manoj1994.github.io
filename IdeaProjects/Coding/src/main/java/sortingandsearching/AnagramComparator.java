package sortingandsearching;

import java.util.*;

public class AnagramComparator implements Comparator<String> {

    public String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }


    @Override
    public int compare(String o1, String o2) {
        return sortString(o1).compareTo(sortString(o2));
    }
}
