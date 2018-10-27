package arraysandstrings;

public class RotateString {


    public static boolean isRotate(String s1, String s2) {

        int length1 = s1.length();
        int length2 = s2.length();

        if(length1 != length2) {
            return false;
        }



        return true;
    }

    public static void main(String[] args) {

        String s1 = "manoj";
        String s2 = "anojm";
        System.out.println(isRotate(s1, s2));

    }
}
