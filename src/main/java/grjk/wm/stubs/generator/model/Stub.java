package grjk.wm.stubs.generator.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Stub {

    Request request;
    Response response;
}
