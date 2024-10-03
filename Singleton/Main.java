package Singleton;

public class Main {
    
    public static void main(String[] arg){
        ThreadSafeSingleton  instance =ThreadSafeSingleton.getInstance();
        System.out.println(instance);   
    }
}
