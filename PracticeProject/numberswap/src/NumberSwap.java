public class NumberSwap {

    public static int[] EvenOddSwap (int[] number) {
        int oddIndex = 0;
        int evenIndex = 0;
        while (oddIndex < number.length && evenIndex < number.length) {
            while (oddIndex < number.length && number[oddIndex] % 2 == 0) {
                oddIndex++;

            }
            while (evenIndex < number.length && number.length % 2 != 0) {
                evenIndex++;

            }

            if (evenIndex < number.length && oddIndex < number.length) {
                int temp = number[oddIndex];
                number[oddIndex] = number[evenIndex];
                number[evenIndex] = temp;

                oddIndex++;
                evenIndex++;
            }

        }


        return number;
    }


    public static void main (String[] args) {

    }
}
