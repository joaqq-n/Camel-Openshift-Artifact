package cl.cloud.camel.springboot.hello.world;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("myBean")
public class MySpringBean {

    @Value("${greeting}")
    private String say;

    @Value("${ip.example}")
    private String ip;


    public String saySomething() {
        return ip+" DSL: "+say ;
    }


}
