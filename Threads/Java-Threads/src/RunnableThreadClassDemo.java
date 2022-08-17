public class RunnableThreadClassDemo implements Runnable {

    public void run(){
        for (int x=0;x<=50;x++){
            System.out.println("RunnableThreadClassDemo - "+x);
        }

    }
}
