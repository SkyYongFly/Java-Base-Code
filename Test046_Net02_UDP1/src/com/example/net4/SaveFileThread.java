package com.example.net4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

//服务器端文件保存操作
public class SaveFileThread  extends Thread{
	Socket socket = null;
	
	public SaveFileThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		 try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new FileWriter("d:\\" + System.currentTimeMillis() + ".txt"));
			
			String line = null;
			while((line = reader.readLine()) != null){
				writer.write(line);
				writer.newLine();
				writer.flush();
			}
			
			OutputStream outputStream = socket.getOutputStream();
			outputStream.write("文件接收并保存成功！".getBytes());
			
			outputStream.close();
			writer.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
