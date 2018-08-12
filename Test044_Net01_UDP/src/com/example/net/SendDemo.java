package com.example.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP传输发送端
 * @author zhu
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		//创建用于UDP发送端的Socket
		DatagramSocket socket = new DatagramSocket();
		
		//设置要发送的数据
		byte[] data = "你好，我来自火星".getBytes();
		int length = data.length;
		//设置要传送至的计算机和端口
		InetAddress address = InetAddress.getByName("127.0.0.1");
		int port = 9999;
		//疯传传输数据对象
		DatagramPacket packet = new DatagramPacket(data, length, address, port);
		
		//传输数据
		socket.send(packet);
		
		//关闭资源
		socket.close();
	}
}	
