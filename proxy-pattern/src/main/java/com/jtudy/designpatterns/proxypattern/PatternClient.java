package com.jtudy.designpatterns.proxypattern;

public class PatternClient {

	public static void main(String[] args) {

		IRemoteWork remoteWork = new ProxyRemoteWork();
		remoteWork.doWork();
	}

}
