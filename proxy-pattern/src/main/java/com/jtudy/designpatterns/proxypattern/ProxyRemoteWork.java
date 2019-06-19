package com.jtudy.designpatterns.proxypattern;

public class ProxyRemoteWork implements IRemoteWork {

	private RemoteWork remoteWork;
	
	@Override
	public void doWork() {
		
		if(isAuthorized()) {
			getRemoteWork().doWork();
		} else {
			System.out.println("not authorized.");
		}
	}
	
	private boolean isAuthorized() {
		return true;
	}
	
	private IRemoteWork getRemoteWork() {
		if(remoteWork == null) {
			remoteWork = new RemoteWork();
		}
		return remoteWork;
	}

}
