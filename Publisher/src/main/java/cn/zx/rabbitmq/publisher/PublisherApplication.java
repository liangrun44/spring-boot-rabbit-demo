package cn.zx.rabbitmq.publisher;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class PublisherApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(PublisherApplication.class, args);
    }


}
