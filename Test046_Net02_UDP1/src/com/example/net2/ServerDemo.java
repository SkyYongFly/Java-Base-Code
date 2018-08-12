package com.example.net2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//TCP服务器端:接收数据后返回数据
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//创建服务器端Socket
		//指定监听端口
		ServerSocket server = new ServerSocket(9999);
		//设置等待时间
		//超时：Exception in thread "main" java.net.SocketTimeoutException: Accept timed out
		server.setSoTimeout(20000);
		
		//阻塞式接收数据
		Socket socket = server.accept();
		InputStream inputStream = socket.getInputStream();
		byte[] by = new byte[1024];
		int length = inputStream.read(by);
		String data = new String(by,0, length);
		
		System.out.println("从IP地址为：" + socket.getInetAddress().getHostAddress() +  "的客户端获取的数据为：" + data);
		
		//向客户端发送数据
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("我很好哒".getBytes());
		
		//关闭资源
		socket.close();
		server.close();
	}
}
