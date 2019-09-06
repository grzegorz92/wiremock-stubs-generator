package grjk.wm.stubs.generator.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Response {

    int status;
    JsonBody jsonBody;
    Headers headers;
}
