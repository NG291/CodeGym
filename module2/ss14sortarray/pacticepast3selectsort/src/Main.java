//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double [] list= {3.3,3.2,3.4,3,5,1.1};
         SelectSort.selectSort(list);
       for(int i=0; i<list.length; i++){
           System.out.println(list[i]);
       }
    }
}