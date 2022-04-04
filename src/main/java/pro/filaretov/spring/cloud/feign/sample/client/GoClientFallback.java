package pro.filaretov.spring.cloud.feign.sample.client;

public class GoClientFallback implements GoClient {

    @Override
    public String sayHello(String message) {
        return "This is sayHello fallback";
    }

    @Override
    public String callNonexistentPath(String message) {
        return "This is callWrongPath fallback";
    }
}
