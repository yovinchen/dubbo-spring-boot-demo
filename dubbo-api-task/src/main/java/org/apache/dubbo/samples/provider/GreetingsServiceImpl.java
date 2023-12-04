package org.apache.dubbo.samples.provider;

import org.apache.dubbo.samples.api.GreetingsService;

/**
 * ClassName: GreetingsServiceImpl
 * Package: org.apache.dubbo.samples.provider
 *
 * @author yovinchen
 * @Create 2023/12/4 16:04
 */
public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayHi(String name) {
        return "hi, " + name;
    }
}
