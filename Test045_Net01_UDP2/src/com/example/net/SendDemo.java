package com.example.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		//�Ӽ���¼������
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
		
		//�ͷ���Դ
		socket.close();
	}
}	
