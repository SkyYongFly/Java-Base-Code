package com.example.redis;

import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Jedis工具类
 * 
 * @author zhu
 */
public class JedisUtil {
	private static JedisPool jedisPool = null;
	
	static {
		if(null == jedisPool) {
			Properties properties = new Properties();
			try {
				properties.load(Jedis.class.getClassLoader().getResourceAsStream("config.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//连接池设置
			JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
			jedisPoolConfig.setMaxIdle(Integer.parseInt((String)properties.get("maxIdle")));//最大空闲个数
			jedisPoolConfig.setMinIdle(Integer.parseInt((String)properties.get("minIdle")));//最小空闲个数
			jedisPoolConfig.setMaxTotal(Integer.parseInt((String)properties.get("maxTotal")));//最大连接数
			
			//连接池
			jedisPool = new JedisPool(jedisPoolConfig, 
					(String)properties.get("ip"), Integer.parseInt((String)properties.get("port")));
		}
	}
	
	/**
	 * 获取Jedis
	 * 
	 * @return
	 */
	public Jedis getJedis() {
		return jedisPool.getResource();
	}
	
	
	@Test
	public void testGetJedis() {
		System.out.println(getJedis().get("name"));
	}

}
