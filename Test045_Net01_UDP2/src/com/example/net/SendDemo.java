package com.example.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		//从键盘录入数据
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		while((line = reader.readLine()) != null){
			DatagramPacket packet = new DatagramPacket(line.getBytes(),line.getBytes().length, 
					InetAddress.getByName("127.0.0.1"), 9999);
			
			socket.send(packet);
			
			if("886".equals(line)){
				break;
			}
		}
		
		//释放资源
		socket.close();
	}
}	
