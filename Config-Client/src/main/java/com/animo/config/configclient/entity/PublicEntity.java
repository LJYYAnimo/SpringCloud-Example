package com.animo.config.configclient.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 刘金泳
 * @Date 2019/9/11
 */
@Component
@ConfigurationProperties(prefix = "public")
public class PublicEntity {

    private String appName;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
