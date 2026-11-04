public class revNum {

    public static String revNum (String input) {
        String NumOnly = "";
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                NumOnly += input.charAt(i);
            }

        }
        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i)))
            {
                result += NumOnly.charAt(NumOnly.length() - 1 - j);
                j++;
            }
            else
            {
                result += input.charAt(i);
            }

        }
        return result;

    }


    public static void main (String[] args) {

    }
}
