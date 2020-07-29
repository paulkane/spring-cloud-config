package roxorgaming.paulkane.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClientConfig {

    @Bean
    @RefreshScope
    public MyBean myBean(@Value("${property.filename}") String filename,
                         @Value("${max.number.of.lines}") int maxLines,
                         @Value("${config.client.max.timeout}") int clientMaxTimeout) {
        return MyBean.builder()
            .filename(filename)
            .maxLines(maxLines)
            .clientMaxTimeout(clientMaxTimeout)
            .build();
    }

    @Bean
    public MyMoreComplexBean myMoreComplexBean(@Autowired MyBean myBean) {
        return MyMoreComplexBean.builder()
            .myBean(myBean)
            .build();
    }
}
