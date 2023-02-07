public class Main {
    public static void main(String[] args) {

        int num = 5, k = 0, count = 0, count1 = 0;

        System.out.println("(a)");

        for (int i = 1; i <= num; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("(b)");

        for (int i = 1; i <= num; ++i, k = 0) {
            for (int space = 1; space <= num - i; ++space) {
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }

            System.out.println();
        }

        System.out.println("(c)");


        for (int i = num; i >= 1; --i) {
            for (int space = 1; space <= num - i; ++space) {
                System.out.print(" ");
            }

            for (int j = i; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }

            for (int j = 0; j < i - 1; ++j) {
                System.out.print("*");
            }

            System.out.println();

        }

        System.out.println("(d)");

        for (int i = 1; i <= num; ++i) {
            for (int space = 1; space <= num - i; ++space) {
                System.out.print(" ");
                ++count;
            }

            while (k != 2 * i - 1) {
                if (count <= num - 1) {
                    System.out.print((i + k) + "");
                    ++count;
                } else {
                    ++count1;
                    System.out.print((i + k - 2 * count1) + "");
                }

                ++k;
            }
            count1 = count = k = 0;

            System.out.println();

        }

        System.out.println("(e)");

        for (int i = 1; i <= num; ++i, k = 0) {
            for (int space = 1; space <= num - i; ++space) {
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }

            System.out.println();
        }
        for (int i = num; i >= 1; --i) {
            for (int space = 1; space <= num - i; ++space) {
                System.out.print(" ");
            }

            for (int j = i; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }

            for (int j = 0; j < i - 1; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


