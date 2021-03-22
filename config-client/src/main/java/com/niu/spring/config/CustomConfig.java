package com.niu.spring.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义配置
 *
 * @author [nza]
 * @version 1.0 [2021/03/22 13:27]
 * @createTime [2021/03/22 13:27]
 */
@Data
@Configuration
public class CustomConfig {

    @Value("${custom.example}")
    private String example;

}
