package Singleton;

import javax.management.RuntimeErrorException;

public class StaticBloackInilatization {
    
    private static StaticBloackInilatization instance;

    private StaticBloackInilatization(){};

    static{
        try{
            instance = new StaticBloackInilatization();
        }catch(Error e){
            throw new RuntimeException("Exception Occured");
        }
    }

    public static StaticBloackInilatization getInstance(){
        return instance;
    }
}
