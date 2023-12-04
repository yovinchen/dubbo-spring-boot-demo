package org.apache.dubbo.samples.provider;

import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.samples.api.GreetingsService;

/**
 * ClassName: Application
 * Package: org.apache.dubbo.samples.provider
 *
 * @author yovinchen
 * @Create 2023/12/4 16:05
 */
public class Application {
    public static void main(String[] args) {
        // 定义具体的服务
        ServiceConfig<GreetingsService> service = new ServiceConfig<>();
        service.setInterface(GreetingsService.class);
        service.setRef(new GreetingsServiceImpl());

        // 启动 Dubbo
        DubboBootstrap.getInstance()
                .application("first-dubbo-provider")
                .registry(new RegistryConfig("zookeeper://8.130.127.71:2181"))
                .protocol(new ProtocolConfig("dubbo", -1))
                .service(service)
                .start()
                .await();
    }
}
