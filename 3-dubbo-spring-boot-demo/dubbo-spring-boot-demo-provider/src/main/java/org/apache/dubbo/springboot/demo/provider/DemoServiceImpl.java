package org.apache.dubbo.springboot.demo.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.springboot.demo.DemoService;

/**
 * ClassName: DemoServiceImpl
 * Package: org.apache.dubbo.springboot.demo.provider
 *
 * @author yovinchen
 * @Create 2023/12/4 15:26
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
