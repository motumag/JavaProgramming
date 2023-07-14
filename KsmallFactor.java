public class KsmallFactor {
    public static boolean hasKSmallFactors(int k, int n) {
        if (k <= 0 || n <= 0) {
            return false;
        }
        for (int u = 1; u < k; u++) {
            if (n % u == 0) {
                int v = n / u;
                if (v < k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasKSmallFactors(10, 20));
        System.out.println(hasKSmallFactors(6, 20));
        System.out.println(hasKSmallFactors(7, 20));
        System.out.println(hasKSmallFactors(8, 20));
    }

}