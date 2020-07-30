package roxorgaming.paulkane.client.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyBean {
    private String filename;
    private int clientMaxTimeout;
    private int maxLines;
}
