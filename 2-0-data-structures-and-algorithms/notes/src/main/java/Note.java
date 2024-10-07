import java.util.Arrays;

public class Note {
    public static void main(String[] args) {
        int[] ints = new int[]{5, 2, 4, 6, 1};
        insertionSort(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void insertionSort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            System.out.println("Outer iteration");
            int val = ints[i];
            for (int j = i - 1; j >= 0 && val < ints[j]; j--) {
                System.out.println("Inner iteration");
                ints[j + 1] = ints[j];
                ints[j] = val;
            }
        }
    }
}
