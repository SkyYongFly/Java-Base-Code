package com.example.net;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getByName("LAPTOP-OQS4TA1A");
		System.out.println(inetAddress.getHostAddress());
		
		InetAddress inetAddress2 = Inet4Address.getByName("192.168.1.106");
		System.out.println(inetAddress2.getHostName());
	}
}


