public class IDCheck {

    /* The method will change the character number to the digital number and if the DigitalNumber
     * isn't the character of '0' to '10', which '10' is character 'X', the method will return -1. */
    public static int CharToDigital (char DigitalNumber) {
        int digital = -1;

        if (DigitalNumber >= '0' && DigitalNumber <= '9') {
            digital = DigitalNumber - '0';
        }
        if (DigitalNumber == 'X' || DigitalNumber == 'x') {
            digital = 10;
        }
        return digital;
    }


    // this method is to check whether the ID is valid.
    public static boolean isValidID (String input) {
        boolean result = false;
        int CheckDigital = CharToDigital(input.charAt(input.length() - 1));
        // if the CheckDigital is -1, the ID is not a valid ID.
        String Text = input.substring(0, input.length() - 1);
        if (CheckDigital != -1 && input.length() >= 5) {
            int count = 0;
            for (int i = 0; i < Text.length(); i++ ) {
                if (Character.isDigit(Text.charAt(i))) {
                    count += (Text.charAt(i) - '0');
                }
            }
            if ((count % 11) == CheckDigital) {
                result = true;
            }
        }
        return result;
    }

    public static void main (String[] args) {

    }

}
