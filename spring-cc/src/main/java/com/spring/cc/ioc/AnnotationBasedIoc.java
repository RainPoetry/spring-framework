package com.spring.cc.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenchong
 * @create 2021/2/21 4:20 下午
 * @description
 *   基于注解方式创建的 IOC 容器
 */

public class AnnotationBasedIoc {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	}
}
