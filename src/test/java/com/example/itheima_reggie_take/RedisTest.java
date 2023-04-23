package com.example.itheima_reggie_take;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@SpringBootTest
//@RunWith(SpringRunner.class)
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testCommon() {
    }
}
