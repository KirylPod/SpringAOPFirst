package by.java.training.spring.loggins;

import org.springframework.stereotype.Component;

@Component
public class MyLogger {                        // Аспект

    public void printValue(Object obj){
        System.out.println(obj);

    }
    public void init(){
        System.out.println("init");
    }

    public void close(){
        System.out.println("close");
    }
}
