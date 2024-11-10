package koti.example.demo;

import io.camunda.zeebe.spring.client.annotation.ZeebeWorker;
import org.springframework.stereotype.Component;

@Component
public class sample {
    @ZeebeWorker(type = "metrobankintilization", autoComplete = true)
    public void zeeclass(){
        System.out.println("this is a test service task");
    }
}
