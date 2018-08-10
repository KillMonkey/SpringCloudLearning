package org.service.hello;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring4all.swagger.EnableSwagger2Doc;


@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableSwagger2Doc
public class ServiceHelloApplication
{
    private static Logger logger = LoggerFactory.getLogger(ServiceHelloApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(ServiceHelloApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name)
    {
        logger.error("Invoke ServiceHelloApplication Error");
        logger.info("Invoke home: params" + name);
        logger.info("Method home process end");
        return "hi " + name + " ,i am from port:" + port;
    }
}
