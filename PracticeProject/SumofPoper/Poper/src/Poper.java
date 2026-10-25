public class Poper {

    public static int SumOfPoper(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % (i + 1) == 0) sum += num[i];
        }
        return sum;
    }

    public static void main (String[] args) {
        int[] num = new int[]{1, 2, 6};
        System.out.println(SumOfPoper(num));
        int[] num1 = new int[]{10, 25};
        System.out.println(SumOfPoper(num1));
    }
}
