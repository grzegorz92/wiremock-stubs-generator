package grjk.wm.stubs.generator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Headers {

    @JsonProperty("Content-Type")
    String contentType;
}
