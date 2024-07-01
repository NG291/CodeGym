public class main {
    public static void main(String[] args) {
        Count count= new Count();
        try{
           while (count.getMyThread().isAlive()){
               System.out.println(" Main thread will be alvie till the child thread is live");
               Thread.sleep(1500);
           }
        }catch (InterruptedException e){
            System.out.println(" Main thread Interrupted ");
        }
        System.out.println(" My thread run is over");

    }
}
