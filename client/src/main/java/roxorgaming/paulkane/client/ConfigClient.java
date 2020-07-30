package roxorgaming.paulkane.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import roxorgaming.paulkane.client.domain.MyBean;
import roxorgaming.paulkane.client.domain.MyMoreComplexBean;

@SpringBootApplication
@RestController
public class ConfigClient {

    private final MyBean myBean;
    private final MyMoreComplexBean myMoreComplexBean;

    @Autowired
    public ConfigClient(MyBean myBean, MyMoreComplexBean myMoreComplexBean) {
        this.myBean = myBean;
        this.myMoreComplexBean = myMoreComplexBean;
    }

    @RequestMapping("/")
    public String home() {
        return String.format("myBean=%s%n" +
            "myMoreComplexBean=%s%n", myBean, myMoreComplexBean);
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }
}
