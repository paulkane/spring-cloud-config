package roxorgaming.paulkane.embedded;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MySimpleBean {
    private String filename;
    private int clientMaxTimeout;
    private int maxLines;
}
