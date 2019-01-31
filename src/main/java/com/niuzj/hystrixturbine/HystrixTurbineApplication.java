package com.niuzj.hystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixTurbineApplication {

    /**
     * turbine 监控多个服务, 通过连接eureka注册中心,并指定应用名
     * turbine包含hystrix dashboard, 所以访问界面依然是http:hostname:port/hystrix
     * 只不过需要在输入框中输入turbine监控的路径, 默认为/turbine.stream, 如http://localhost:9001/turbine.stream
     */
    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbineApplication.class, args);
    }

}

