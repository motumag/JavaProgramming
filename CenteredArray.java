public class CenteredArray {
    public static int isCentered(int[] a) {
        if (a.length % 2 == 0 || a.length == 0) {
            return 0;
        }
        int middNum = a.length / 2;
        int midValue = a[middNum];
        for (int i = 0; i < a.length; i++) {
            if (i != middNum && a[i] <= midValue) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isCentered(new int[] { 5, 3, 3, 4, 5 }));
        System.out.println(isCentered(new int[] { 3, 2, 1, 4, 5 }));
        System.out.println(isCentered(new int[] { 3, 2, 1, 1, 4, 6 }));
    }
}
