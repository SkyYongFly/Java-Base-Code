package com.example.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//TCP��������
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//������������Socket
		//ָ�������˿�
		ServerSocket server = new ServerSocket(9999);
		//���õȴ�ʱ��
		//��ʱ��Exception in thread "main" java.net.SocketTimeoutException: Accept timed out
		server.setSoTimeout(2000);
		
		//����ʽ��������
		Socket socket = server.accept();
		InputStream inputStream = socket.getInputStream();
		byte[] by = new byte[1024];
		int length = inputStream.read(by);
		String data = new String(by,0, length);
		
		System.out.println("��IP��ַΪ��" + socket.getInetAddress().getHostAddress() +  "�Ŀͻ��˻�ȡ������Ϊ��" + data);
		
		//�ر���Դ
		socket.close();
		server.close();
	}
}
