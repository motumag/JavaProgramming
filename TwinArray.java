public class TwinArray {
    static int isTwin1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) && (isPrime(a[i] + 2) || isPrime(a[i] - 2))) {
                boolean flag = false;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == a[i] + 2 && isPrime(a[i] + 2)) {
                        flag = true;
                        break;
                    }
                    if (a[j] == a[i] - 2 && isPrime(a[i] - 2)) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    return 0;
                }
            }
        }
        return 1;
    }

    static int isTwin(int[] a) {
        boolean twinPrimeFlag;
        for (int a1 : a) {
            twinPrimeFlag = true;
            if (isPrime(a1) && (isPrime(a1 - 2) || isPrime(a1 + 2))) {
                twinPrimeFlag = false;
                for (int a2 : a) {
                    if (isPrime(a1 - 2) && a2 == a1 - 2) {
                        twinPrimeFlag = true;
                        break;
                    }

                    if (isPrime(a1 + 2) && a2 == a1 + 2) {
                        twinPrimeFlag = true;
                        break;
                    }
                }
            }
            if (!twinPrimeFlag)
                return 0;
        }
        return 1;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        System.out.println(isTwin(new int[] { 3, 5, 8, 10, 27 }));
        System.out.println(isTwin(new int[] { 11, 9, 12, 13, 23 }));
        System.out.println(isTwin(new int[] { 5, 3, 14, 7, 18, 67 }));
        System.out.println(isTwin(new int[] { 13, 14, 15, 3, 5 }));
        System.out.println(isTwin(new int[] { 1, 17, 8, 25, 67 }));
    }
}
