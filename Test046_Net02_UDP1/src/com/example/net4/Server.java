package com.example.net4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//TCP传输服务器端：接收客户端上传的文件
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
		
		while(true){
			Socket socket = serverSocket.accept();
			new SaveFileThread(socket).start();
		}
	}
}
