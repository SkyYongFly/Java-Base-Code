package com.example.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP传输接收端
 * @author zhu
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//用于UDP的Scocket
		//指定监听端口
		DatagramSocket datagramSocket = new DatagramSocket(9999);
		
		//创建一个数据包，用于接收数据
		byte[] bys = new byte[1024];
		int length = bys.length;
		DatagramPacket datagramPacket = new DatagramPacket(bys, length);
		
		//调用Socket的接收方法接收数据
		//该方法为阻塞式，会一直等待直到接收到数据
		datagramSocket.receive(datagramPacket);
		
		//解析获取的数据
		InetAddress  inetAddress = datagramPacket.getAddress();
		String  ip = inetAddress.getHostAddress();
		byte[] data =  datagramPacket.getData();
		int len = datagramPacket.getLength();
		String str = new String(data, 0, len);
		
		System.out.println("从ip地址为:" + ip + " 的计算机接受到的数据为：" + str);
		
		//释放资源
		datagramSocket.close();
	}
}
