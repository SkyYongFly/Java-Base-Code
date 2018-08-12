package com.example.net4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//TCP传输客户端：上传本地文件到服务器
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 9999);
		
		BufferedReader reader = new BufferedReader(new FileReader("d:\\1.txt"));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		String line = null;
		while((line = reader.readLine()) != null){
			writer.write(line);
			writer.newLine();
			writer.flush();
		}
		
		socket.shutdownOutput();
		
		InputStream inputStream = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int length = inputStream.read(bytes);
		String backedData = new String(bytes, 0, length);
		
		System.out.println("接收到服务器端返回的内容：" + backedData);
		
		reader.close();
		socket.close();
	}
}
