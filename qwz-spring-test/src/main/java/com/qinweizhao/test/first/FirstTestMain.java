package com.qinweizhao.test.first;

import com.qinweizhao.test.first.bean.TestBean;
import com.qinweizhao.test.first.config.ContextConfig;
import com.qinweizhao.test.first.service.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qinweizhao
 * @since 2022/3/17
 */
public class FirstTestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
		IUserService bean = context.getBean(IUserService.class);
		System.out.println(bean);
		TestBean testBean = (TestBean) context.getBean("testBean");
		testBean.test();

	}
}
