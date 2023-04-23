package com.example.itheima_reggie_take;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class JedisTest {
    @Test
    public void testJedis() {
        // 1 获取链接
        Jedis jedis = new Jedis("localhost", 6379);

        // 2 执行具体的操作
        jedis.set("user", "xiaoming");

        // 3 关闭链接
        jedis.close();
    }
}
