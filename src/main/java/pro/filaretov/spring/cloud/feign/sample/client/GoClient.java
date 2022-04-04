package pro.filaretov.spring.cloud.feign.sample.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import pro.filaretov.spring.cloud.feign.sample.dto.MessageDto;

@FeignClient(
    name = "goClient",
    url = "http://localhost:8080/go",
    fallbackFactory = GoClientFallbackFactory.class
)
public interface GoClient {

    @PostMapping("/hello")
    String sayHello(@RequestBody String message, @RequestParam String additionalParam, @RequestParam Boolean canBeUsed);

    @PostMapping("/nonexistent/path")
    String callNonexistentPath(@RequestBody MessageDto message);

    // TODO - how to pass param for fallback in GET method?
    @GetMapping("/exception")
    String callException();
}
