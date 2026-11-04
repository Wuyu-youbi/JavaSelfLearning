public class diamondIsForever {

    public static void diamond (int number) {
        int mid = number / 2;

        for (int i = 0; i < number; i++ ) {
            int d = Math.abs(i - mid);
            int pointCount = d;
            int starCount = number - 2 * d;

            for (int j = 0; j < pointCount; j++ ) {
                System.out.print(".");
            }

            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < pointCount; j++ ) {
                System.out.print(".");
            }

            System.out.print("\n");

        }

    }

    public static void main (String[] args) {
        diamond(5);
        diamond(9);
    }


}
