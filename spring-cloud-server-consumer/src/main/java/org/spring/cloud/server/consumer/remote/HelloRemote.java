package org.spring.cloud.server.consumer.remote;

import org.spring.cloud.server.consumer.remote.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-provider",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
	
	@RequestMapping("/provider/hello")
	public String index(@RequestParam(value = "param") String param);
}
