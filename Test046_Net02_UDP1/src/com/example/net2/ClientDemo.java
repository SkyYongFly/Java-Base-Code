package com.example.net2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//TCP���Ͷˣ����������ݽ��շ������˷��͵�����
public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//�½�����TCP����Ķ���
		Socket socket = new Socket("127.0.0.1", 9999);
		
		//����������������ݵ���������
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("��ð���".getBytes());
		
		//���շ������˷��͵�����
		InputStream inputStream = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int length = inputStream.read(bytes);
		String data = new String(bytes, 0, length);
		
		System.out.println("��ȡ�����������ص����ݣ�" + data);
		
		//�ر���Դ
		socket.close();
	}
}
