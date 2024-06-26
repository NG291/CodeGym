public class InsertSort2 {
    public static void insertSort2(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 4, 5, 6, 1, 3};
        System.out.print("Array before loop");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
        }
        System.out.println();
        insertSort2(list);
        System.out.print("Array after loop");
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]);
        }
    }
}
