public class Application {
    public static void main(String[] args) {

        //using extending Thread class
        ThreadClassDemo t1=new ThreadClassDemo();
        t1.setDaemon(true);// if this is true program will exist when the main method exits, it will not wait until child complete its task
        //t1.setPriority(1);
        t1.start();

        //using runnable interface
        RunnableThreadClassDemo r1= new RunnableThreadClassDemo(); //When creating a new thread, the Priority value will be its parent Priority value
        Thread t2=new Thread(r1);
        //t2.setPriority(10);
        t2.setDaemon(true);
        t2.start();

        for (int x=0;x<=5;x++){
            System.out.println("== "+Thread.currentThread().getName()+" == "+x); //System.out.println("Parent class - "+x);
        }

        System.out.println("===========End of the main thread==============");

    }
}
