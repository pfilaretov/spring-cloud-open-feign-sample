package pro.filaretov.spring.cloud.feign.sample.client;

import pro.filaretov.spring.cloud.feign.sample.dto.MessageDto;

public class GoClientFallback implements GoClient {

    @Override
    public String sayHello(String message, String additionalParam, Boolean canBeUsed) {
        return "This is sayHello fallback. additionalParam=" + additionalParam + ", canBeUsed=" + canBeUsed;
    }

    @Override
    public String callNonexistentPath(MessageDto message) {
        return "This is callNonexistentPath fallback. additionalParam=" + message.getAdditionalParam() + ", canBeUsed="
            + message.getCanBeUsed();
    }

    @Override
    public String callException(MessageDto messageDto) {
        return "This is callException fallback";
    }
}
