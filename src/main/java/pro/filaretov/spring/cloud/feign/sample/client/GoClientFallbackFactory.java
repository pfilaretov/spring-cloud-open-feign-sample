package pro.filaretov.spring.cloud.feign.sample.client;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class GoClientFallbackFactory implements FallbackFactory<GoClient> {

    @Override
    public GoClient create(Throwable cause) {
        return new GoClientFallback();
    }
}
