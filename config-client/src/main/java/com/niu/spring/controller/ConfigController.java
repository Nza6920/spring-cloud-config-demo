package com.niu.spring.controller;

import com.google.common.collect.Maps;
import com.niu.spring.config.CustomConfig;
import lombok.AllArgsConstructor;
import org.springframework.cloud.config.client.ConfigServicePropertySourceLocator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 控制器
 *
 * @author [nza]
 * @version 1.0 [2021/03/22 13:39]
 * @createTime [2021/03/22 13:39]
 */
@RestController
@RequestMapping("configs")
@AllArgsConstructor
public class ConfigController {

    private final CustomConfig customConfig;

    /**
     * 获取配置
     *
     * @return {@link Map} 配置集合
     */
    @GetMapping
    public Map<String, String> findAll() {

        Map<String, String> res = Maps.newHashMap();

        if (customConfig != null) {
            res.put("example", customConfig.getExample());
        }

        return res;
    }
}
