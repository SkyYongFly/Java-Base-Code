package com.example.net2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//TCP发送端：发送完数据接收服务器端发送的数据
public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//新建用于TCP传输的对象
		Socket socket = new Socket("127.0.0.1", 9999);
		
		//利用输出流发送数据到服务器端
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("你好啊！".getBytes());
		
		//接收服务器端发送的数据
		InputStream inputStream = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int length = inputStream.read(bytes);
		String data = new String(bytes, 0, length);
		
		System.out.println("获取到服务器返回的数据：" + data);
		
		//关闭资源
		socket.close();
	}
}
