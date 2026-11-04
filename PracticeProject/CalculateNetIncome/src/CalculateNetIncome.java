public class CalculateNetIncome {

    public static int calcNetIncome (String text) {
        int income = 0;
        int currentNumber = 0;
        boolean isNegative = false;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }

            if (currentNumber > 0 && (!Character.isDigit(currentChar) || i == text.length() - 1)) {
                if (isNegative) {
                    income -= currentNumber;
                    isNegative = false;
                }
                else {
                    income += currentNumber;
                }
                currentNumber = 0;
            }

            if (currentChar == '-' && Character.isDigit(text.charAt(i + 1))) {
                isNegative = true;
            }
        }

        return income;
    }


    public static void main (String[] args) {

    }


}
