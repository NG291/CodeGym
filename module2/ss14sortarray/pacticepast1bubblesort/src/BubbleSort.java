import com.sun.org.apache.bcel.internal.generic.SWAP;

public class BubbleSort {
    static int [] list= {8,8,3,3,1 ,8,6,2};
    public static void bubbleSort(int [] list){
        boolean nextNextPast= true;
        for(int i=0; i<list.length&& nextNextPast; i++){
          nextNextPast= false;
            for(int j=1; j< list.length-i; j++){
                if(list[j-1]>list[j]){
                    int temp= list[j-1];
                    list[j-1]=list[j];
                    list[j]= temp;
                    nextNextPast= true;
                }
            }
        }
    }
     public static void main(String[] args) {
        bubbleSort(list);
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]);
        }
    }
}
