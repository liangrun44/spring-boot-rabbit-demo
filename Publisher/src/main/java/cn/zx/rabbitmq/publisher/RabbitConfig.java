package cn.zx.rabbitmq.publisher;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    //作用：如果rabbit中不存在名为XXX的列队，则会创建一个
    @Bean
    public Queue HelloQueue() {
        return new Queue("hello");
    }
    @Bean
    public Queue DemoQueue() {
        return new Queue("demo");
    }
}
