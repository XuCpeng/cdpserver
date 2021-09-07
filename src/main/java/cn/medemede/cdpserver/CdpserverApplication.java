package cn.medemede.cdpserver;

import com.blinkfox.fenix.EnableFenix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xcp
 */

@SpringBootApplication
@EnableFenix
public class CdpserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(CdpserverApplication.class, args);
    }

}
