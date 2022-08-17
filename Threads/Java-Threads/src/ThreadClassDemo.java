public class ThreadClassDemo extends Thread {
    //overriding start method is not necessary
    //calling super.start() can be placed anywhere with the method since it is a super class method and not a super constructor
    @Override
    public void start(){
        System.out.println("========Thread for ThreadClassDemo is starting=======");
        super.start();
    }

    @Override
    public void run(){
        for (int x=0;x<=50;x++){
            System.out.println("ThreadClassDemo - "+x);
        }

    }

}
