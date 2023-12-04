package org.apache.dubbo.samples.client;

import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.samples.api.GreetingsService;

import java.io.IOException;

/**
 * ClassName: Application
 * Package: org.apache.dubbo.samples.client
 *
 * @author yovinchen
 * @Create 2023/12/4 16:07
 */

public class Application {
    public static void main(String[] args) throws IOException {
        ReferenceConfig<GreetingsService> reference = new ReferenceConfig<>();
        reference.setInterface(GreetingsService.class);

        DubboBootstrap.getInstance()
                .application("first-dubbo-consumer")
                .registry(new RegistryConfig("zookeeper://8.130.127.71:2181"))
                .reference(reference);

        GreetingsService service = reference.get();
        String message = service.sayHi("dubbo");
        System.out.println("Receive result ======> " + message);
        System.in.read();
    }
}
