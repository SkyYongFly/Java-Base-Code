package com.example.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//TCP发送端
public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//新建用于TCP传输的对象
		Socket socket = new Socket("127.0.0.1", 9999);
		
		//利用输出流发送数据到服务器端
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("你好啊！".getBytes());
		
		//关闭资源
		socket.close();
	}
}
