package com.example.redis;

import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Jedis������
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
			
			//���ӳ�����
			JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
			jedisPoolConfig.setMaxIdle(Integer.parseInt((String)properties.get("maxIdle")));//�����и���
			jedisPoolConfig.setMinIdle(Integer.parseInt((String)properties.get("minIdle")));//��С���и���
			jedisPoolConfig.setMaxTotal(Integer.parseInt((String)properties.get("maxTotal")));//���������
			
			//���ӳ�
			jedisPool = new JedisPool(jedisPoolConfig, 
					(String)properties.get("ip"), Integer.parseInt((String)properties.get("port")));
		}
	}
	
	/**
	 * ��ȡJedis
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
