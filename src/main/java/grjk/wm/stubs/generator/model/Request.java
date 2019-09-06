package grjk.wm.stubs.generator.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Request {

    String method;
    String url;
}
