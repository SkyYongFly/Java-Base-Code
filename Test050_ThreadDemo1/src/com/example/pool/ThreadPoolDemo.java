package com.example.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池测试代码
 * @author zhu
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		//创建线程池
		//核心线程数量5、最大线程数量10、如果线程数量大于5且空闲线程时间等待超过200毫秒则销毁、任务缓存队列最多缓存5个任务
		ThreadPoolExecutor threadPoolExecutor = 
				new ThreadPoolExecutor(5, 10, 200,TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(5));
		
		for(int i = 0 ; i < 20; i++){
			MyTask myTask = new MyTask();
			
			//任务交由线程池执行
			threadPoolExecutor.execute(myTask);
			
			//打印相关信息
			System.out.println("线程池中线程数目：" + threadPoolExecutor.getPoolSize() + ";队列中等待执行任务：" +
			threadPoolExecutor.getQueue().size() + ";已执行完任务数目：" + threadPoolExecutor.getCompletedTaskCount());
		}
	}
}

class MyTask implements Runnable{
	@Override
	public void run() {
		System.out.println("线程_" + Thread.currentThread().getName() + " 执行完毕！");
	}
}
