package com.spring.cc.ioc;

import com.spring.cc.beans.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenchong
 * @create 2021/2/21 4:20 下午
 * @description 基于 Spring.xml 配置文件创建的 IOC 容器
 */

public class XmlBasedIoc {

	public static void main(String[] args) {
		// 创建 Ioc 容器，最终通过 refresh()
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext();
		applicationContext.setConfigLocations("spring.xml");
		// 在 ClassPathXmlApplicationContext 的构造方法中自动调用
		applicationContext.refresh();
		Hello hello = applicationContext.getBean(Hello.class);
		hello.say();
	}
}
