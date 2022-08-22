public class Application {
    public static void main(String[] args) throws InterruptedException {
        Employee emp1=new Employee();
        Thread t1=new Thread(emp1);
        t1.start();

        System.out.println("Person A Going to meet Person B");
        t1.join(2000); //waiting for 2sec until t1 complete

        t1.interrupt(); //interrupt method waits until t1 is going to sleep then only it will interrupt otherwise not
        t1.yield(); // this means giving a chance to execute to another thread

    }
}
