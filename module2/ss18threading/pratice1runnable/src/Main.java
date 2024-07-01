import javax.xml.ws.EndpointReference;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");
        demoRunnable dr = new demoRunnable("Thread-1-HR-Database");
        dr.start();
//        demoRunnable dr1= new demoRunnable("Thread-2-Send-Email");
//        dr1.start();
        System.out.println("Main thread stopped!!! ");

    }
}
