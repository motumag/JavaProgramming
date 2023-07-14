import java.util.Arrays;

public class FillArray {
    public static int[] fill(int[] arr, int k, int n) {
        if (k <= 0 || n <= 0) {
            return null;
        }
        int[] arr2 = new int[n];
        int index = 0;
        for (int i = 0; i < k; i++) {
            arr2[index++] = arr[i];
        }
        int count = 0;
        while (index < n) {
            arr2[index++] = arr[count++ % k];
        }
        return arr2;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fill(new int[] { 1, 2, 3, 5, 9, 12, -2, -1 }, 3, 10)));
        System.out.println(Arrays.toString(fill(new int[] { 4, 2, -3, 12 }, 1, 5)));
        System.out.println(Arrays.toString(fill(new int[] { 2, 6, 9, 0, -3 }, 0, 4)));
    }
}
