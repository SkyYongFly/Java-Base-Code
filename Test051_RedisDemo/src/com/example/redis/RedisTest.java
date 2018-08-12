package com.example.redis;

import org.junit.jupiter.api.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * redis 连接测试Demo
 * 
 * @author zhu
 */
public class RedisTest {
	@Test
	public void testRedis() {
		//1、获取数据库连接
		Jedis jedis = new Jedis("192.168.126.130", 6379);
		
		//2、获取数据
		String name = jedis.get("name");
		System.out.println("name: " + name);
		
		//3、设置数据
		jedis.set("address", "中国江苏");
		System.out.println("address: " + jedis.get("address"));
		
		jedis.close();
	}
	
	
	@Test
	public void testPool() {
		//连接池设置
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxIdle(20);//最大空闲个数
		jedisPoolConfig.setMinIdle(10);//最小空闲个数
		jedisPoolConfig.setMaxTotal(30);//最大连接数
		
		//连接池
		JedisPool jedisPool = new JedisPool(jedisPoolConfig,"192.168.126.130", 6379);
		Jedis jedis = jedisPool.getResource();
		
		System.out.println("name: " + jedis.get("name"));
		
		//关闭资源
		jedis.close();
		jedisPool.close();
	}

}
