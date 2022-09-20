public class First_20_Prime {
    public static void main(String[] args) {

        int i, n = 2, flag = 0, counter = 0;

        while (counter < 20) {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(n);
                counter++;
            }

            n++;
            flag = 0;
        }

    }

}
