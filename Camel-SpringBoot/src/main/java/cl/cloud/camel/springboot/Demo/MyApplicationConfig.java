package cl.cloud.camel.springboot.hello.world;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.apache.camel.CamelContext;   


@Configuration
public class MyApplicationConfig  {

    @Autowired
    CamelContext camelContext;

    @Bean
    public void getCamelContext() {
        
    }

    // @Bean
    // CamelContextConfiguration contextConfiguration() {
    //   return new CamelContextConfiguration() {
    //     @Override
    //     void beforeApplicationStart(CamelContext context) {
    //       // your custom configuration goes here
    //     }
    //   };
    // }

}   