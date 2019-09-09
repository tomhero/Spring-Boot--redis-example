package com.example.demo.config;

import com.example.demo.model.Person;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * BeanConfig
 */
@Configuration
@PropertySource("application.properties")
public class BeanConfig {

    @Value("${redis.host}")
    private String redisHostName;

    @Value("${redis.port}")
    private int redisPort;

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration(redisHostName, redisPort);
        // redisStandaloneConfiguration.setPassword(RedisPassword.of("password"));
        return new JedisConnectionFactory(redisStandaloneConfiguration);
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory());
        // To prevent default Hashed key value string prepanded to all data in redis
        // e.g. "\xac\xed\x00\x05t\x00\x04USER" --> "USER"
        template.setKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());
        
        template.setHashValueSerializer(new Jackson2JsonRedisSerializer<Person>(Person.class));
        return template;
    }
}
