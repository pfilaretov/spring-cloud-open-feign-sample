package pro.filaretov.spring.cloud.feign.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudOpenFeignSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOpenFeignSampleApplication.class, args);
    }

}
