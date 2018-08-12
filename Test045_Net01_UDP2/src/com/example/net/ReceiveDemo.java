package com.example.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP������ն�
 * @author zhu
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//����UDP��Scocket
		//ָ�������˿�
		DatagramSocket datagramSocket = new DatagramSocket(9999);
		
		while(true){
			byte[] bytes = new byte[1024];
			DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
			
			datagramSocket.receive(packet);
			String data = new String(packet.getData(), 0, packet.getLength());
			if("886".equals(data)){	//�������
				break;
			}
			
			System.out.println("���յ�������Ϊ��" + data);
		}
		
		//�ͷ���Դ
		datagramSocket.close();
	}
}
