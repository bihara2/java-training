public class Application {
    public static void main(String[] args) throws InterruptedException {
        Employee emp1=new Employee();
        Thread t1=new Thread(emp1);
        t1.start();

        t1.join(2000);

        System.out.println("Person A Going to meet Person B");


    }
}
