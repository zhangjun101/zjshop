package com.zj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class ConfigServer {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServer.class, args);
	}
}
