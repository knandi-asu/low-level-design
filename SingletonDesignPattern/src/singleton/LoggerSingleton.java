package singleton;


public class LoggerSingleton {
    //volatile - a keyword in java that exposes the threads that are accessing instance
    private static volatile LoggerSingleton instance=null;
    private LoggerSingleton(){
        if(instance!=null){
            throw new RuntimeException("Dont try to be smart");
        }
    }
    public static LoggerSingleton getInstance(){
        if(instance==null){
            //thread safety is achieved by using synchronised either at class level or block level
            //Now we are using synchronised at block level
            //This code block will ensure that no two threads are initializing the same resource at the same time
            synchronized (LoggerSingleton.class){
                if(instance==null){
                    instance=new LoggerSingleton();
                }
            }
        }
        return instance;
    }
}
