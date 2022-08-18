public class Employee implements Runnable{
    @Override
    public void run(){
        for (int a=5;a>0;a--){
            System.out.println("Person B Finish the work within "+a+"sec");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Person B Finished the work and met person A");
    }
}
