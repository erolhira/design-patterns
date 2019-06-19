package com.jtudy.designpatterns.proxypattern;

public class RemoteWork implements IRemoteWork {

	@Override
	public void doWork() {
		System.out.println("Remote work is done.");
	}

}
