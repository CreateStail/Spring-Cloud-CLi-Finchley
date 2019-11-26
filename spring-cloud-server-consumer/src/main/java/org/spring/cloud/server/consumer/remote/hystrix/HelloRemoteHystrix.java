package org.spring.cloud.server.consumer.remote.hystrix;

import org.spring.cloud.server.consumer.remote.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote{

	@Override
	public String index(String param) {
		return "this is hystrix" + param;
	}
	
	

}
