import java.sql.ClientInfoStatus;

public class BinarySearch {
    static int[] list ={ 2,3,7,10,11,45,50,59,60,66,70,79};
    static int binarySearch(int [] list, int key){
        int low=0;
        int high= list.length-1;
        while (high>=low){
            int mid= (low+high)/2;
            if(list[mid]==key){
                return mid;
            }
            else if(list[mid]> key) {
                 high= mid-1;
            }
            else{
                low= mid+1;
            }

        }
    return -1;
    }
}
