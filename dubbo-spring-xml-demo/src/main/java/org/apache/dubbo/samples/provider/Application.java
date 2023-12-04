package org.apache.dubbo.samples.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * ClassName: Application
 * Package: org.apache.dubbo.samples.provider
 *
 * @author yovinchen
 * @Create 2023/12/4 16:18
 */
public class Application {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-demo-provider.xml");
        context.start();

        // 挂起主线程，防止退出
        new CountDownLatch(1).await();
    }
}
