package com.fp;

import java.util.HashSet;

import com.fp.ConsistentHash.HashFunction;

public class Test {

	public static void main(String[] args) {
		
		HashSet<ServerInfo> set = new HashSet<ServerInfo>();
		set.add(new ServerInfo("192.168.1.1",9001));
		set.add(new ServerInfo("192.168.1.2",9002));
		set.add(new ServerInfo("192.168.1.3",9003));
		set.add(new ServerInfo("192.168.1.4",9004));
		
		ConsistentHash<ServerInfo> consistentHash = new ConsistentHash<ServerInfo>(new HashFunction(), 1000, set);
		
		System.out.println(consistentHash.get("192.168.1.4").ip);
	}

}
