public class StringPractice {

    public static String removeLeftmostSubstring(String initial, String target) {
        int index = 0;
        while ((index = initial.indexOf(target)) != -1) {
            initial = initial.substring(0, index) + initial.substring(index + target.length(), initial.length());
        }
        return initial;
    }


    public static void main (String[] args) {


    }

}
