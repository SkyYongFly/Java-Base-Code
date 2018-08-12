package com.example.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP传输接收端
 * @author zhu
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//用于UDP的Scocket
		//指定监听端口
		DatagramSocket datagramSocket = new DatagramSocket(9999);
		
		while(true){
			byte[] bytes = new byte[1024];
			DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
			
			datagramSocket.receive(packet);
			String data = new String(packet.getData(), 0, packet.getLength());
			if("886".equals(data)){	//结束标记
				break;
			}
			
			System.out.println("接收到的数据为：" + data);
		}
		
		//释放资源
		datagramSocket.close();
	}
}
