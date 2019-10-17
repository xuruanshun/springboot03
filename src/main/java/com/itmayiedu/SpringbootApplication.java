package com.itmayiedu;

import com.itmayiedu.config.DBConfig1;
import com.itmayiedu.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
// 开启读取配置文件
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
