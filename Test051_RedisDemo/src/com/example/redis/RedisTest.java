package com.example.redis;

import org.junit.jupiter.api.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * redis ���Ӳ���Demo
 * 
 * @author zhu
 */
public class RedisTest {
	@Test
	public void testRedis() {
		//1����ȡ���ݿ�����
		Jedis jedis = new Jedis("192.168.126.130", 6379);
		
		//2����ȡ����
		String name = jedis.get("name");
		System.out.println("name: " + name);
		
		//3����������
		jedis.set("address", "�й�����");
		System.out.println("address: " + jedis.get("address"));
		
		jedis.close();
	}
	
	
	@Test
	public void testPool() {
		//���ӳ�����
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxIdle(20);//�����и���
		jedisPoolConfig.setMinIdle(10);//��С���и���
		jedisPoolConfig.setMaxTotal(30);//���������
		
		//���ӳ�
		JedisPool jedisPool = new JedisPool(jedisPoolConfig,"192.168.126.130", 6379);
		Jedis jedis = jedisPool.getResource();
		
		System.out.println("name: " + jedis.get("name"));
		
		//�ر���Դ
		jedis.close();
		jedisPool.close();
	}

}
