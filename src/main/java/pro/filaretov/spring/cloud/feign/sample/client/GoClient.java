package pro.filaretov.spring.cloud.feign.sample.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
    name = "goClient",
    url = "http://localhost:8080",
    fallbackFactory = GoClientFallbackFactory.class
)
public interface GoClient {

    @PostMapping("/go/hello")
    String sayHello(@RequestBody String message);

    @PostMapping("/nonexistent/path")
    String callNonexistentPath(@RequestBody String message);
}
