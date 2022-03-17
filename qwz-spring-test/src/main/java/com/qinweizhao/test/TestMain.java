package com.qinweizhao.test;

import com.qinweizhao.test.bean.TestBean;
import com.qinweizhao.test.config.ContextConfig;
import com.qinweizhao.test.service.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qinweizhao
 * @since 2022/3/17
 */
public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
		IUserService bean = context.getBean(IUserService.class);
		System.out.println(bean);
		TestBean testBean = (TestBean) context.getBean("testBean");
		testBean.test();

	}
}
