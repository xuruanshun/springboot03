package com.itmayiedu.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

// 读取配置文件中的数据源信息 前缀是 spring.datasource.test01的配置信息
@Data
@ConfigurationProperties(prefix = "spring.datasource.test01")
public class DBConfig1 {

	private String url;
	private String username;
	private String password;
	private int minPoolSize;
	private int maxPoolSize;
	private int maxLifetime;
	private int borrowConnectionTimeout;
	private int loginTimeout;
	private int maintenanceInterval;
	private int maxIdleTime;
	private String testQuery;
}