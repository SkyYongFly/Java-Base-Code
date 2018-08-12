package com.example.net3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//TCP发送端：从键盘录入数据发送到服务器端
public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("客户端：");
		
		//新建TCP 客户端Socket
		Socket socket = new Socket("127.0.0.1", 9999);
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data = null;
		while((data = reader.readLine()) != null){
			writer.write(data);
			writer.newLine();
			writer.flush();
			
			if("886".equals(data)){
				break;
			}
		}
		
		//关闭资源
		socket.close();
	}
}
