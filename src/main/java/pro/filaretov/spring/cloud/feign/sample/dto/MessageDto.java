package pro.filaretov.spring.cloud.feign.sample.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageDto {

    private String message;

    @JsonIgnore
    private String additionalParam;

    @JsonIgnore
    private Boolean canBeUsed;
}
