package roxorgaming.paulkane.embedded;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigServer
public class AppWithEmbeddedServer {

    private final MySimpleBean mySimpleBean;

    @Autowired
    public AppWithEmbeddedServer(MySimpleBean mySimpleBean) {
        this.mySimpleBean = mySimpleBean;
    }

    @RequestMapping("/mySimpleBean")
    public String home() {
        return String.format("mySimpleBean=%s%n", mySimpleBean);
    }

    public static void main(String[] args) {
        SpringApplication.run(AppWithEmbeddedServer.class, args);
    }
}
