package org.spring.cloud.server.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.slf4j.Slf4j;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
@Slf4j
public class ZipKinApplication 
{
    public static void main( String[] args )
    {
       SpringApplication.run(ZipKinApplication.class, args);
       log.info("链路追踪服务开启成功");
    }
}
