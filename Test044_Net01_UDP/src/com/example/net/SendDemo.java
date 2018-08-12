package com.example.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP���䷢�Ͷ�
 * @author zhu
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		//��������UDP���Ͷ˵�Socket
		DatagramSocket socket = new DatagramSocket();
		
		//����Ҫ���͵�����
		byte[] data = "��ã������Ի���".getBytes();
		int length = data.length;
		//����Ҫ�������ļ�����Ͷ˿�
		InetAddress address = InetAddress.getByName("127.0.0.1");
		int port = 9999;
		//�贫�������ݶ���
		DatagramPacket packet = new DatagramPacket(data, length, address, port);
		
		//��������
		socket.send(packet);
		
		//�ر���Դ
		socket.close();
	}
}	
