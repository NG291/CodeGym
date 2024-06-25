public class SelectSort {
    public static void selectSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentIndex = i;
            for (int j=i+1;j < list.length; j++){
                if(currentMin>list[j]){
                    currentMin= list[j];
                    currentIndex=j;
                }
            }
            if(currentIndex!= i){
                list[currentIndex]=list[i];
                list[i]= currentMin;
            }
        }
    }
}
