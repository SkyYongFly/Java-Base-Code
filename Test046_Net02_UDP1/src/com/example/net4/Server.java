package com.example.net4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//TCP����������ˣ����տͻ����ϴ����ļ�
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
		
		while(true){
			Socket socket = serverSocket.accept();
			new SaveFileThread(socket).start();
		}
	}
}
