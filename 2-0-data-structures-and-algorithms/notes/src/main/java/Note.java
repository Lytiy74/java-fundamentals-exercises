import java.util.Arrays;

public class Note {
    public static void main(String[] args) {
        int sizeOfData = 500000;
        int[] ints = new int[sizeOfData];
        fillWithRandomNumber(ints, sizeOfData);

        long startTimeFillingArray = System.currentTimeMillis();
        long finishTimeFillingArray = System.currentTimeMillis();
        long d0 = finishTimeFillingArray - startTimeFillingArray;

        //************** INSERTION SORT **************
        int[] intsForInsertion = Arrays.copyOf(ints, ints.length);
        long startTimeInsertionSort = System.currentTimeMillis();
        insertionSort(intsForInsertion);
        long finishTimeInsertionSort = System.currentTimeMillis();
        long d = finishTimeInsertionSort - startTimeInsertionSort;
        System.out.printf(" Insertion Sort = %d\n", d / 1000);

        //************** BUBBLE SORT *****************
        int[] intsForBubble = Arrays.copyOf(ints, ints.length);
        long startTimeBubbleSort = System.currentTimeMillis();
        bubbleSort(intsForBubble);
        long finishTimeBubbleSort = System.currentTimeMillis();
        d = finishTimeBubbleSort - startTimeBubbleSort;
        System.out.printf(" Bubble Sort = %d\n", d / 1000);

        //************** MERGE SORT *****************
        int[] intsForMerge = Arrays.copyOf(ints, ints.length);
        long startTimeMergeSort = System.currentTimeMillis();
        intsForMerge = mergeSort(intsForMerge);
        long finishTimeMergeSort = System.currentTimeMillis();
        long d3 = finishTimeMergeSort - startTimeMergeSort;
        System.out.printf(" Merge Sort = %d\n", d3 / 1000);
    }

    private static void fillWithRandomNumber(int[] ints, int i) {
        for (int i1 = 0; i1 < ints.length; i1++) {
            ints[i1] = (int) (Math.random() * i);
        }
    }

    private static void insertionSort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            int val = ints[i];
            for (int j = i - 1; j >= 0 && val < ints[j]; j--) {
                ints[j + 1] = ints[j];
                ints[j] = val;
            }
        }
    }

    private static void bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
    }

    private static int[] mergeSort(int[] ints) {
        if (ints.length <= 1) return ints;
        int middle = ints.length / 2;
        int[] left = new int[middle];
        int[] right = new int[ints.length - middle];

        for (int i = 0; i < left.length; i++) {
            left[i] = ints[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = ints[i + left.length];
        }
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int resultIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < left.length || rightIndex < right.length) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] <= right[rightIndex]) {
                    result[resultIndex++] = left[leftIndex++];
                } else {
                    result[resultIndex++] = right[rightIndex++];
                }
            } else if (leftIndex < left.length) {
                result[resultIndex++] = left[leftIndex++];
            } else if (rightIndex < right.length) {
                result[resultIndex++] = right[rightIndex++];
            }
        }
        return result;
    }
}
