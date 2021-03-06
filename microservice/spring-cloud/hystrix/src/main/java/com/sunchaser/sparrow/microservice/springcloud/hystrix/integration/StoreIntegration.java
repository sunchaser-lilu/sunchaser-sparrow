package com.sunchaser.sparrow.microservice.springcloud.hystrix.integration;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author sunchaser admin@lilu.org.cn
 * @since JDK8 2021/1/7
 */
@Component
public class StoreIntegration {

    @HystrixCommand(fallbackMethod = "defaultStores")
    public String getStores() {
        int nextInt = ThreadLocalRandom.current().nextInt(60);
        int i = 0;
        if (nextInt > 30) i = 1 / 0;
        return "getStores" + i;
    }

    public String defaultStores() {
        return "defaultStores";
    }
}
