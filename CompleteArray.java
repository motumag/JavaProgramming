public class CompleteArray {
    // An array is defined to be complete if all its elements are greater than 0 and
    // all even
    // numbers that are less than the maximum even number are in the array.
    // For example {2, 3, 2, 4, 11, 6, 10, 9, 8} is complete because
    // a. all its elements are greater than 0
    // b. the maximum even integer is 10
    // c. all even numbers that are less than 10 (2, 4, 6, 8) are in the array.
    // But {2, 3, 3, 6} is not complete because the even number 4 is missing.
    // {2, ­3, 4, 3, 6} is not complete because it contains a negative number.
    static int isComplete(int[] a) {
        int maximumEven = Integer.MIN_VALUE;

        for (int anA : a) {
            if (anA < 0) {
                return 0;
            }

            if (anA % 2 == 0 && anA > maximumEven) {
                maximumEven = anA;
            }
        }
        if (maximumEven != 10) return 0;

        for (int i = 2; i < maximumEven; i++) {
            if (i % 2 == 0) {
                boolean flag = false;

                for (int anA : a) {
                    if (anA == i) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    return 0;
            }
}
