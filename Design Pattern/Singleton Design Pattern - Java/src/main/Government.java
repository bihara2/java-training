package main;

public class Government {
    private static volatile Government newGovernment;

    private Government(){
        if(newGovernment!=null){
            throw  new RuntimeException("Please use becomeNewGovernment method!");
        }
    }

    public static Government becomeNewGovernment (){

        if(newGovernment==null){
            synchronized (Government.class){
                if(newGovernment==null){
                    newGovernment=new Government();
                }
            }
        }
        return newGovernment;
    }


}
