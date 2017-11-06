package Lab04;

public class Mergesort {

    private Mergesort()
    {

    }

    private int[] numbers;
    private int[] others;

    private int size;

    private void sort(int[] values) {
        numbers = values;
        size = values.length;
        others = new int[size];
        mergeSort(0, size - 1);
    }

    private void mergeSort(int low, int high) {

        if (low < high) {

            int middle = low + (high - low) / 2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        for (int i = low; i <= high; i++) {
            others[i] = numbers[i];
        }
        int i = low;
        int j = middle + 1;
        int v = low;
        while (i <= middle && j <= high) {
            if (others[i] <= others[j]) {
                numbers[v] = others[i];
                i++;
            } else {
                numbers[v] = others[j];
                j++;
            }
            v++;
        }
        while (i <= middle) {
            numbers[v] = others[i];
            v++;
            i++;
        }

    }

    public static void main(String[] args) {
        int A[] = {2, 5, 8, 3, 6, 9, 1, 6, 5};

        System.out.println("Original:");
        for(int j = 0; j < A.length; j++){
            System.out.print(A[j] + " ");
        }
        System.out.println();

        Mergesort cd = new Mergesort();
        cd.sort(A);
        System.out.println("Sorted");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

    }
}
