package com.example.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//TCP���Ͷ�
public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//�½�����TCP����Ķ���
		Socket socket = new Socket("127.0.0.1", 9999);
		
		//����������������ݵ���������
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("��ð���".getBytes());
		
		//�ر���Դ
		socket.close();
	}
}
