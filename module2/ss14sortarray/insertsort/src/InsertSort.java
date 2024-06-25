public class InsertSort {
    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k>= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
            System.out.print("array after iteration " + i + ": ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] list = {5, 2, 3, 1, 4, 6};
        System.out.print("array before looping: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+"\t");
        }
        System.out.println();
        insertSort(list);
    }
}
