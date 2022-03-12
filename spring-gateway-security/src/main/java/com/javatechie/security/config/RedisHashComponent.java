package com.javatechie.security.config;

import com.javatechie.security.util.MapperUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class RedisHashComponent {

    private final RedisTemplate<String,Object> redisTemplate;

    public RedisHashComponent(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void hSet(String key,Object hashKey,Object value){
        Map ruleHash= MapperUtils.objectMapper(value,Map.class);
        redisTemplate.opsForHash().put(key, hashKey, ruleHash);
    }

    public List<Object> hValues(String key){
        return  redisTemplate.opsForHash().values(key);
    }

    public Object hGet(String key,Object hashKey){
       return redisTemplate.opsForHash().get(key, hashKey);
    }
}
