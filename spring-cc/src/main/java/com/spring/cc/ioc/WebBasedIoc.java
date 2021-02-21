package com.spring.cc.ioc;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;

/***
 * @author chenchong
 * @create 2021/2/21 4:21 下午
 * @description
 * 		在 Web 应用中 IOC 容器的创建方式
 */

public class WebBasedIoc {

	public static void main(String[] args) {
		// 在 web.xml 中注入 Spring 实现的 ContextLoaderListener 监听器
		// <listener> <listener-class> ContextLoaderListener </listener-class></listener>
		// ContextLoaderListener 继承自 ServletContextListener，用于在 Web 服务器创建和销毁时注入自定义操作
		ContextLoaderListener listener = new ContextLoaderListener();
		// 在 Web 容器初始化完毕的时候，会调用 contextInitialized 方法
		// 然后创建 ApplicationContext 作为 Ioc 容器，并注入 Bean 对象
//		listener.contextInitialized(null);

	}

	public static void init() {
		// 创建 Ioc 容器
		XmlWebApplicationContext context = new XmlWebApplicationContext();
		// 注入 Bean 实例
		context.refresh();
	}
}
