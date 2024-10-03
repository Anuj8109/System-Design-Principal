package Singleton;

import java.util.*;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){};

    private static LazySingleton getInstance(){
        //check if instance is null
        if(instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}
