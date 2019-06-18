package by.java.training.spring.objects;

import org.springframework.stereotype.Component;

@Component
public class SomeService {                    // Целевой

    public int getIntValue(){
        return 5;
    }

    public double getDoubleValue(){
        return 5.6;
    }
}
