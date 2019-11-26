package org.spring.cloud.server.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试客户端读取git上配置文件内容
 * @author issuser
 *
 */
@RestController
@RefreshScope
@RequestMapping("/consumer")
public class ConfigController {
	
	@Value("${test.name}")
	private String testName;
	
	@RequestMapping("/readConfig")
	public String readCOnfig() {
		return this.testName;
	}

}
