package roxorgaming.paulkane.embedded;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmbeddedConfig {

    @Bean
    @RefreshScope
    public MySimpleBean mySimpleBean(@Value("${property.filename:not-set}") String filename,
                                     @Value("${max.number.of.lines:-1}") int maxLines,
                                     @Value("${config.client.max.timeout:-1}") int clientMaxTimeout) {
        return MySimpleBean.builder()
            .clientMaxTimeout(clientMaxTimeout)
            .filename(filename)
            .maxLines(maxLines)
            .build();
    }
}
