package com.example.net3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//TCP��������:�������ݺ󷵻�����
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("�������ˣ�");
		
		//������������Socket
		//ָ�������˿�
		ServerSocket server = new ServerSocket(9999);
		
		Socket socket = server.accept();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String data = null;
		while((data = reader.readLine()) != null){
			System.out.println("�ӿͻ��˽��յ�����Ϊ��" + data);
			
			if("886".equals(data)){
				System.out.println("���յ�������ǣ�����~~~~~~~~");
				break;
			}
		}
		
		
		//�ر���Դ
		server.close();
	}
}
