package com.example.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.yml")
public class MysqlDataSource {

	@Bean
	@ConfigurationProperties("app.datasource")
	public HikariDataSource hikariDataSource() {
		return DataSourceBuilder
				.create()
				.type(HikariDataSource.class)
				.build();
	}

}
