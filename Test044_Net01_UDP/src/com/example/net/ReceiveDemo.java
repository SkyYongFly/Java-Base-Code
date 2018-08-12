package com.example.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP������ն�
 * @author zhu
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//����UDP��Scocket
		//ָ�������˿�
		DatagramSocket datagramSocket = new DatagramSocket(9999);
		
		//����һ�����ݰ������ڽ�������
		byte[] bys = new byte[1024];
		int length = bys.length;
		DatagramPacket datagramPacket = new DatagramPacket(bys, length);
		
		//����Socket�Ľ��շ�����������
		//�÷���Ϊ����ʽ����һֱ�ȴ�ֱ�����յ�����
		datagramSocket.receive(datagramPacket);
		
		//������ȡ������
		InetAddress  inetAddress = datagramPacket.getAddress();
		String  ip = inetAddress.getHostAddress();
		byte[] data =  datagramPacket.getData();
		int len = datagramPacket.getLength();
		String str = new String(data, 0, len);
		
		System.out.println("��ip��ַΪ:" + ip + " �ļ�������ܵ�������Ϊ��" + str);
		
		//�ͷ���Դ
		datagramSocket.close();
	}
}
