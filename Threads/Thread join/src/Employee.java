public class Employee implements Runnable{
    @Override
    public void run(){
        try {
            System.out.println("Person B is going to sleep for 5sec!!");
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
            System.out.println("Interrupted!! Person A is waiting for Person B!!");
        }

        for (int a=5;a>0;a--){
            System.out.println("Person B Finish the work within "+a+"sec");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted during B's Work ");
            }
        }
        System.out.println("Person B Finished the work and met person A");
    }
}
