package pro.filaretov.spring.cloud.feign.sample.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.filaretov.spring.cloud.feign.sample.client.GoClient;

@Slf4j
@RestController
@RequestMapping("/go")
@RequiredArgsConstructor
public class GoController {

    private final GoClient goClient;

    @GetMapping("/{id}")
    public String getHello(@PathVariable String id) {
        log.warn("Hello id received: {}", id);
        String result = goClient.sayHello("Hello from id " + id);
        log.warn("Hello id result: {}", result);
        return "ok";
    }

    @GetMapping("/wrong/{id}")
    public String testFallback(@PathVariable String id) {
        log.warn("Wrong id received: {}", id);
        String result = goClient.callNonexistentPath("Hello from id " + id);
        log.warn("Wrong id result: {}", result);
        return "ok";
    }

    @PostMapping("/hello")
    public String sayHello(@RequestBody String message) {
        log.warn("Hello message is here: {}", message);
        return "success";
    }
}
