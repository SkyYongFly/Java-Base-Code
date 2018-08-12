package com.example.net3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//TCP服务器端:接收数据后返回数据
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("服务器端：");
		
		//创建服务器端Socket
		//指定监听端口
		ServerSocket server = new ServerSocket(9999);
		
		Socket socket = server.accept();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String data = null;
		while((data = reader.readLine()) != null){
			System.out.println("从客户端接收到数据为：" + data);
			
			if("886".equals(data)){
				System.out.println("接收到结束标记，结束~~~~~~~~");
				break;
			}
		}
		
		
		//关闭资源
		server.close();
	}
}
