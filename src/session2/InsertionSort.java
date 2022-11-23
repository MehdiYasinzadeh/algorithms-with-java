package session2;

public class InsertionSort {
    public static void insertionSort(int[] array) {

        int n = array.length;

        for (int j = 1; j < n; j++) {

            int key = array[j]; // current place
            int i = j - 1; // last place

            // find best place for current value of index
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;

        }
    }

    public static void main(String[] a) {
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Insertion Sort");

//        Arrays.stream(arr1).forEach(num -> System.out.println(num + " "));

        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(arr1);//sorting array using insertion sort

//        Arrays.stream(arr1).forEach(num -> System.out.println(num + " "));


        System.out.println("After Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}