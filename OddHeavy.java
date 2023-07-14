public class OddHeavy {
    static int isOddHeavy(int[] a) {
        boolean oddFlag = false;
        int smallestOdd = Integer.MAX_VALUE;
        int largestEven = Integer.MIN_VALUE;
        for (int anA : a) {
            if (anA % 2 != 0) {
                oddFlag = true;
                if (anA < smallestOdd)
                    smallestOdd = anA;
            } else {
                if (anA > largestEven)
                    largestEven = anA;
            }
        }
        if (oddFlag && smallestOdd > largestEven)
            return 1;
        else
            return 0;
    }
}
